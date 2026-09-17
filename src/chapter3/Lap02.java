package chapter3;

import java.util.Scanner;

public class Lap02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		float score;
		int count = 0;
		float total = 0;
		do {
			System.out.print("nhap vao diem: ");
			score = sc.nextFloat();
			if (score < -1 || score > 10) {
				System.out.println("Khong hop le, yeu cau nhap lai");
				continue;
			}
			if (score != -1) {
				total += score;
				count++;
			} else {
				System.out.println("===== MENU =====\n" + "1. Tính điểm trung bình\n" + "2. Phân loại học lực\n"
						+ "3. Thoát chương trình\n" + "================\n" + "");
			}
		} while (score != -1);

		float scoreMedium = (float) total / count;

		int choose = sc.nextInt();

		switch (choose) {
		case 1: {
			System.out.println("Diem trung binh = " + total + "/" + count + " = " + scoreMedium);
			break;
		}
		case 2: {
			if (scoreMedium >= 9 && scoreMedium <= 10) {
				System.out.println("xuat sac");
			} else if (scoreMedium >= 9 && scoreMedium <= 10) {
				System.out.println("gioi");
			} else if (scoreMedium >= 8 && scoreMedium < 9) {
				System.out.println("kha");
			} else if (scoreMedium >= 6.5 && scoreMedium < 8) {
				System.out.println("trung binh");
			} else {
				System.out.println("yeu");
			}
			break;
		}
		case 3: {
			System.out.println("Thoat chuong trinh!!!");
			break;
		}

		}

		sc.close();
	}
}
