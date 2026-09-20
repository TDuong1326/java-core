package chapter7.lap06;

public abstract class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;

	}

	public void introduce() {
		System.out.println("My name is " + this.name + ", I am " + this.age + " years old.");
	}

	abstract void work();

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

}
