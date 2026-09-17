package chapter3;

import java.util.Scanner;

public class Video28 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float score = sc.nextFloat();
		boolean condition = score >= 18;

		if (score >= 9) {
			System.out.println("ban dat xuat sac");
		} else if (score >= 8 && score < 9) {
			System.out.println("ban dat gioi");
		} else if (score >= 7 && score < 8) {
			System.out.println("ban dat kha");
		} else {
			System.out.println("ban dat trung binh");
		}

//		if(age < 18) {
//			System.out.println("ban chua du 18 tuoi");
//		}

		System.out.println("condition = " + condition);
		sc.close();
	}
}
