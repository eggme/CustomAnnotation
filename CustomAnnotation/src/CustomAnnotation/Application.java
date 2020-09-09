package CustomAnnotation;

import java.lang.reflect.Field;

public class Application {

	public static void main(String[] args) throws IllegalArgumentException, IllegalAccessException {
		
		UserVO runner = new UserVO();
		System.out.println(runner.toString());
		
		Field[] fields = runner.getClass().getDeclaredFields();
		for(Field field : fields) {
			System.out.println(field.getName());
			if(field.getAnnotation(TestAnnotationInt.class) != null) {
				TestAnnotationInt annotationInt = field.getAnnotation(TestAnnotationInt.class);
				field.setAccessible(true);
				field.set(runner, annotationInt.age());
			}else {
				TestAnnotationString annotationString = field.getAnnotation(TestAnnotationString.class);
				field.setAccessible(true);
				field.set(runner, annotationString.name());
			}
		}
		System.out.println(runner.toString());
	}
}
