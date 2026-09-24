package chapter10.video115;

import java.util.HashMap;
import java.util.TreeMap;

public class Video115 {

	public static void hashMapExample() { // thu tu khong dam bao
		HashMap<Integer, String> students = new HashMap<>();

		students.put(1, "tung duong");// phai dam bao key la duy nhat neu khong se bi ghi de
		students.put(5, "duong");
		students.put(20, "Adam");
		students.put(3, "Trang");

		System.out.println(students);
	}

	public static void treeMapExample() { // tu dong sap xep theo key

		TreeMap<Integer, String> students = new TreeMap<>();

		students.put(1, "tung duong");
		students.put(5, "duong");
		students.put(20, "Adam");
		students.put(3, "Trang");

		System.out.println(students);
	}

	public static void main(String[] args) {

		hashMapExample();

		treeMapExample();
	}
}
