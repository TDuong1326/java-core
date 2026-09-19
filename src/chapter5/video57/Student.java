package chapter5.video57;

public class Student {
	String name; // == default
	String mssv;

	public Student(String name, String mssv) {
		this.name = name;
		this.mssv = mssv;
	}

	void display() {
		System.out.println(this.name + " " + this.mssv);
	}

}
