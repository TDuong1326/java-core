package chapter6.video69;

public class Video69 {

	// (static: tĩnh) ho tro khong khai bao doi tuong ma van dung duoc function
	public static int sum(int a, int b) {
		return a + b;
	}

	public static double sum(double a, double b) {
		return a + b;
	}

	public static int sum(int a, int b, int c) {
		return a + b + c;
	}

	public static void main(String[] args) {
		System.out.println("sum = " + sum(6, 9));
		System.out.println("sum = " + sum(6.1, 9.1));
		System.out.println("sum = " + sum(1, 2, 3));
	}
}
