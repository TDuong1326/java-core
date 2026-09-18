package chapter4;

public class Video43 {
	public static void main(String[] args) {
		double[] score = { 8.5, 7.0, 9.0, 6.5, 8.0 };

		double sum = 0;
		double scoreMedium = 0;

		for (double item : score) {
			sum += item;
		}
		scoreMedium = sum / score.length;
		System.out.println("tong diem = " + sum);
		System.out.println("diem trung binh = " + scoreMedium);
	}
}
