package chapter5.lap04.video60;

import chapter5.lap04.model.Employee;

public class Video60 {

	public static void main(String[] args) {
		Employee e1 = new Employee("duong", 21, "IT", 10000, "GG");
		Employee e2 = new Employee("trang", 21, "marketing", 9000, "MB");

		e1.showInfo();
		System.out.println();
		e2.showInfo();
		System.out.println();

		System.out.println("luong nha vien sau khi tang");
		e1.raiseSalary(6);
		e2.raiseSalary(3);
	}
}
