package CustomAnnotation;

public class UserVO {

	@TestAnnotationString(name = "승준")
	private String name;
	@TestAnnotationInt(age = 25)
	private int age;
	
	public UserVO() {}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	@Override
	public String toString() {
		return "Runner [name=" + name + ", age=" + age + "]";
	}
}
