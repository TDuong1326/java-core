package chapter4;

import java.util.Scanner;

public class Lap03 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String[] students = new String[3];
		double[] score = new double[3];

		double sum = 0;

		for (int i = 0; i < students.length; i++) {
			System.out.print("Nhap vao ten: ");
			students[i] = sc.nextLine();

			System.out.print("Nhap vao diem: ");
			score[i] = sc.nextDouble();

			sum += score[i];

			sc.nextLine();
		}
		for (int i = 0; i < 3; i++) {
			System.out.println("ten hoc sinh: " + students[i] + " va diem hoc sinh: " + score[i]);
		}
		System.out.println("diem trung binh all: " + (sum / students.length));

		for (int i = 0; i < 3; i++) {
			if (score[i] >= 8) {
				System.out.println("ten hoc sinh co diem >8: " + students[i]);
			}
		}

		sc.close();
	}
}
