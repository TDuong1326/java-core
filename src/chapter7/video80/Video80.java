package chapter7.video80;

public class Video80 {
	public static void main(String[] args) {
		FullTimeEmployee ft = new FullTimeEmployee(12345, "duong", "IT");
		PartTimeEmployee pt = new PartTimeEmployee(100, 100, "tung duong", "IT");

		Employee[] e = { ft, pt };
		for (Employee employee : e) {
			employee.printInfo();
			System.out.println("luong cua nhan vien " + employee.getName() + " = " + employee.calculateSalary());
		}
	}
}
