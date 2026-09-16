package chapter2;

import java.util.Scanner;

public class Lap1Bai3 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		// bai 3
		System.out.print("nhap vao canh cua khoi lap phuong = ");
		float c = sc.nextFloat();

		float theTich = (float) Math.pow(c, 3); // có thể dùng double của hàm pow mà k cần ép

		System.out.println("the tich cua hinh lap phuong = " + theTich);
		sc.close();
	}
}
