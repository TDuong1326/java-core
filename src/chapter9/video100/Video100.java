package chapter9.video100;

import java.util.Scanner;

public class Video100 {

	public static void checkScore(int score) {
		if (score < 0 || score > 10) {
			throw new IllegalArgumentException("Điểm không hợp lệ: phải từ 0 đến 10");
		}
		System.out.println("Điểm của bạn là: " + score);
	}

	public static void main(String[] args) {

		// Cach 1:
//		Scanner sc = new Scanner(System.in);
//		System.out.println("nhap vao mot so nguyen: ");
//		int a = sc.nextInt();
//
//		try {
//			checkScore(a);
//		} catch (IllegalArgumentException e) {
//			System.out.println("Error = " + e.getMessage());
//		} finally {
//			System.out.println("ket thuc chuong trinh");
//		}
//		sc.close();

		// Cach 2: try with resources
		System.out.println("nhap vao mot so nguyen: ");

		try (Scanner sc = new Scanner(System.in)) {
			int a = sc.nextInt();
			checkScore(a);
		} catch (IllegalArgumentException e) {
			System.out.println("Error = " + e.getMessage());
		} finally {
			System.out.println("ket thuc chuong trinh");
		}
	}
}
