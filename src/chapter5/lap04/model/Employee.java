package chapter5.lap04.model;

public class Employee {
	private String name;
	private int age;
	private String department;
	private double salary;
	private String company;

	public Employee(String name, int age, String department, double salary, String company) {
		this.name = name;
		this.age = age;
		this.department = department;
		this.salary = salary;
		this.company = company;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public void showInfo() {
		System.out.println("thong tin nhan vien: ");
		System.out.println("name: " + this.name);
		System.out.println("age: " + this.age);
		System.out.println("department: " + this.department);
		System.out.println("company: " + this.company);
		System.out.println("salary: " + this.salary);
	}

	public void raiseSalary(double amount) {
		if (amount > 0) {
			System.out.println("salary = " + (this.salary * 1.15));
		}
	}
}
