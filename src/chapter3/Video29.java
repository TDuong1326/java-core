package chapter3;

import java.util.Scanner;

public class Video29 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("nhap vao diem: ");
		float score = sc.nextFloat();

		if (score >= 9 && score <= 10) {
			System.out.println("hoc luc xuat sac");
		} else if (score >= 8 && score < 9) {
			System.out.println("hoc luc gioi");
		} else if (score >= 6.5 && score < 8) {
			System.out.println("hoc luc kha");
		} else if (score >= 5 && score < 6.5) {
			System.out.println("hoc luc trung binh");
		} else if (score >= 0 && score < 5) {
			System.out.println("hoc luc yeu");
		} else {
			System.out.println("Invalid");
		}

		sc.close();
	}
}
