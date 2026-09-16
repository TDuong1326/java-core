package chapter2;

import java.util.Scanner;

public class Lap1Bai1 {
	public static void main(String[] args) {
		// bai 1
		Scanner scanner = new Scanner(System.in);
		System.out.print("nhap vao ten sinh vien: ");

		String nameStudent = scanner.nextLine();

		System.out.print("nhap vao diem trung binh sinh vien: ");
		float mediumScore = scanner.nextFloat();

		System.out.println("ten sinh vien la: " + nameStudent);
		System.out.println("diem trung binh sinh vien la: " + mediumScore);
		scanner.close();

	}
}
