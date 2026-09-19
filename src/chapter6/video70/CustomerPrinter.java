package chapter6.video70;

public class CustomerPrinter {
//	String name;
//	int age;
//	String city;
//
//	public CustomerPrinter(String name, int age, String city) {
//		this.age = age;
//		this.name = name;
//		this.city = city;
//	}

	void print(String name) {
		System.out.println("name: " + name);
	}

	void print(String name, int age) {
		System.out.println("name: " + name + ", age : " + age);
	}

	void print(String name, int age, String city) {
		System.out.println("name: " + name + ", age : " + age + ", city: " + city);
	}
}
