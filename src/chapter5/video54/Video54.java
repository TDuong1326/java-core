package chapter5.video54;

public class Video54 {
	public static void main(String[] args) {

		Employee em1 = new Employee();
		Employee em2 = new Employee();

		em1.name = "duong";
		em1.salary = 100000;

		em2.name = "trang";
		em2.salary = 10000;

		em1.showInfo();
		em2.showInfo();
	}
}
