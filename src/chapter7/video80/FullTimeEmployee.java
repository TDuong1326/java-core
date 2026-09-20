package chapter7.video80;

public class FullTimeEmployee extends Employee {

	private double monthlySalary;

	public FullTimeEmployee(double monthlySalary, String name, String department) {
		super(name, department);
		this.monthlySalary = monthlySalary;
	}

	@Override
	public double calculateSalary() {
		return monthlySalary;
	}

	@Override
	public void printInfo() {
		super.printInfo();
		System.out.println(", Full time");
	}

	public double getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(double monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

}
