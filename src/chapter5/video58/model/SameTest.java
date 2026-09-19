package chapter5.video58.model;

public class SameTest {
	public static void main(String[] args) {
		System.out.println("Video 58");

		Employee E1 = new Employee();

//		E1.name = "duong"; // private => inside class
		E1.age = 25; // default => same package
		E1.salary = 12345;

	}

}
