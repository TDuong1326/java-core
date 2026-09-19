package chapter6.lap05;

public class Employee extends Person {
	private String employeeId;
	private double salary;

	public Employee(String employeeId, double salary, String name, int age) {
		super(name, age);
		this.employeeId = employeeId;
		this.salary = salary;
	}

	@Override
	public void introduce() {
		super.introduce();
		System.out.print(", employeeId = " + this.employeeId + ", salary = " + this.salary);
	}

	public double calculateSalary() {
		return this.salary;
	}

	public double calculateSalary(double bonus) {
		return this.salary + bonus;
	}

	public String getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

}
