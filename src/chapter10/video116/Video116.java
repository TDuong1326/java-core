package chapter10.video116;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Video116 {

	public static void iteratorExample() {
		ArrayList<String> languages = new ArrayList<>();
		languages.add("Java");
		languages.add("C#");
		languages.add("PHP");
		languages.add("C++");
		languages.add("JavaScript");

		Iterator<String> languagesIterator = languages.iterator();
		while (languagesIterator.hasNext()) {
			String lang = languagesIterator.next();
			if (lang.equals("C#")) {
				languagesIterator.remove();
			}
		}

		for (String lang : languages) {
			System.out.println(lang);
		}
	}

	public static void listIteratorExample() {
		ArrayList<Integer> nums = new ArrayList<>();
		nums.add(10);

		ListIterator<Integer> li = nums.listIterator();

		System.out.println("Duyệt xuôi:");
		while (li.hasNext()) {
			System.out.println(li.next());
		}

		System.out.println("Duyệt ngược:");
		while (li.hasPrevious()) {
			System.out.println(li.previous());
		}

		// Thêm phần tử 25 vào sau 20
		li = nums.listIterator();
		while (li.hasNext()) {
			if (li.next() == 20) {
				li.add(25); // Thêm sau 20
			}
		}

		System.out.println("Sau khi thêm 25: " + nums);

	}

	public static void main(String[] args) {

		iteratorExample();
		listIteratorExample();

//		ArrayList<String> languages = new ArrayList<>();
//		languages.add("Java");
//		languages.add("C#");
//		languages.add("PHP");
//		languages.add("C++");
//		languages.add("JavaScript");
//
//		// throw ConcurrentModificationException
//		for (String language : languages) {
//			if (language.equals("C#")) {
//				languages.remove(language);
//			}
//		}

	}
}
