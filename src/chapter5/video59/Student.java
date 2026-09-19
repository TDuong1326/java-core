package chapter5.video59;

public class Student {

	private String name; // default
	private String grade;

	// de lay ra duoc thuoc tinh cua private cta can
	// viet function va quy dinh pham vi function day (getter/setter)

	public Student(String name, String grade) {
		this.name = name;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

}
