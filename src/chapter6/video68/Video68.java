package chapter6.video68;

public class Video68 {
	public static void main(String[] args) {
		Manager boss = new Manager("IT", "duong", 123, 12345.123);
		Programmer dev = new Programmer("trang", 1234, 1234);

		System.out.println("muc luong cua " + boss.getName() + " = " + boss.calculateSalary());
		System.out.println("muc luong cua " + dev.getName() + " = " + dev.calculateSalary());

	}
}
