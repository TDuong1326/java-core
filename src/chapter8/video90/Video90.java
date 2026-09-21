package chapter8.video90;

import java.util.Scanner;

public class Video90 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("nhap vao trang thai don hang(theo enum): " + "PENDING" + ", SHIPPED, " + "DELIVERED, "
				+ "CANCELLED\n" + "");
		String status = sc.nextLine().toUpperCase();

		// bat loi
		try {
			OrderStatus input = OrderStatus.valueOf(status);
			System.out.println("trang thai: " + input.getStatus());
			System.out.println("trang thai cuoi cung: " + input.hasFinal());
		} catch (Exception e) {
			System.out.println("trang thai khong hop le!");
		}

		sc.close();
	}

}
