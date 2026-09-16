package chapter2;

import java.util.Scanner;

public class Lap1Bai2 {
	public static void main(String[] args) {
		// bai 2
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap vao canh a = ");
		float a = scanner.nextFloat();

		System.out.print("nhap vao canh b = ");
		float b = scanner.nextFloat();

		System.out.println("chu vi hinh chu nhat = " + ((a + b) * 2));
		System.out.println("dien tich hinh chu nhat = " + (a * b));
		System.out.println("canh nho nhat cua hinh chu nhat = " + (Math.min(a, b)));
		scanner.close();
	}
}
