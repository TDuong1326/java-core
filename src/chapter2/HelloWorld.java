/**
 * 
 */
package chapter2;

import java.util.Scanner;

/**
 * 
 */
public class HelloWorld {
	public static void main(String[] args) {

		System.out.print("Hỏi Dân IT");
		System.out.println("với Eric");

		Scanner scanner = new Scanner(System.in);
		int age = scanner.nextInt();
		System.out.println("age = " + age);
		scanner.close();
	}

}
