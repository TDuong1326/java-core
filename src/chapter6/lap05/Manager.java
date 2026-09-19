package chapter6.lap05;

public class Manager extends Employee {
	private String department;

	public Manager(String department, String employeeId, double salary, String name, int age) {
		super(employeeId, salary, name, age);
		this.department = department;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.println(", department = " + this.department);
	}

}
