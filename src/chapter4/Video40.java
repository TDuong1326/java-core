package chapter4;

import java.util.Scanner;

public class Video40 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] array = new int[5];

		int maxIndex = array[0];
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			System.out.print("nhap vao so nguyen: ");
			array[i] = sc.nextInt();

			sum += array[i];

			if (array[i] > maxIndex) {
				maxIndex = array[i];
			}
		}
		System.out.println("tong cua mang la = " + sum);
		System.out.println("so lon nhat cua mang la = " + maxIndex);

		sc.close();
	}
}
