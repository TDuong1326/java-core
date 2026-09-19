package chapter5.video55;

public class Student {

	String name;
	int age;

	public Student() { // ham tao khong tham so (constructor)

	}

	public Student(String name1, int age1) { // ham tao co tham so (constructor)
		this.name = name1;
		this.age = age1;
	}

	void learnJava() {
		System.out.println("run learn java");
	}
}
