package chapter6.lap05;

public class Video71 {
	public static void main(String[] args) {

		Manager boss = new Manager("IT", "123", 123, "duong", 21);

		boss.introduce();
		System.out.println("salary = " + boss.calculateSalary());
		System.out.println("salary bonus = " + boss.calculateSalary(123));
	}
}
