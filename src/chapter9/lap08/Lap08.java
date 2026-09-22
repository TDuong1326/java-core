package chapter9.lap08;

import java.util.Scanner;

public class Lap08 {
	public static void main(String[] args) throws NegativeBalanceException {

		try (Scanner sc = new Scanner(System.in);) {

			System.out.println("Nhap vao username: ");
			String name = sc.nextLine();

			System.out.println("Nhap vao passwork: ");
			String passwork = sc.nextLine();

			System.out.println("Nhap vao so du: ");
			double balance = sc.nextDouble();

			System.out.println("Nhap vao so tien can rut: ");
			double amount = sc.nextDouble();

			BankAccount bAcc = new BankAccount(name, passwork, balance);
			bAcc.withdraw(amount);
		} catch (WeakPasswordException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} catch (NegativeBalanceException e) {
			System.out.println(e.getClass().getSimpleName() + ": " + e.getMessage());
		} finally {
			System.out.println("Giao dich ket thuc");
		}

	}
}
