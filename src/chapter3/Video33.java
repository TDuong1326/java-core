package chapter3;

import java.util.Scanner;

public class Video33 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// Yeu cau 1
//		int tong = 0;
//		for (int i = 0; i <= 100; i++) {
//			tong += i;
//		}
//		System.out.println("tong = " + tong);

		// Yeu cau 2
//		int j = 2;
//		while (j<=20) {
//			if(j%2 == 0) {
//				System.out.println("so chan trong khoang 2->20: " + j);
//			}
//			j++;
//		}

		// Yeu cau 3
//		String name = "hoidanit";
//		System.out.print("nhap vao mat khau: ");
//		String keyPass = sc.nextLine();
//		do {
//			if (!keyPass.equals(name)) {
//				System.out.print("mat khau sai,nhap lai mat khau: ");
//				keyPass = sc.nextLine();
//			}
//		} while (!keyPass.equals(name));
//		System.out.println("Đăng nhập thành công!");

		String name = "hoidanit";
		String keyPass = "";

		do {
			System.out.print("Nhap vao mat khau: ");
			keyPass = sc.nextLine();
		} while (!keyPass.equals(name));
		System.out.println("Dang nhap thanh cong! ");
		sc.close();
	}
}
