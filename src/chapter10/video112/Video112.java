package chapter10.video112;

import java.util.HashSet;
import java.util.TreeSet;

public class Video112 {
	public static void hashSetExample() {
		System.out.println("run hashset");
		HashSet<String> hashSet = new HashSet<>(); // tim kiem O(1)

		hashSet.add("java script");
		hashSet.add("java core");
		hashSet.add("back end");
		hashSet.add("java script");

		System.out.println(hashSet);
	}

	public static void treeSetExample() {
		System.out.println("run hashset");
		TreeSet<Integer> treeSet = new TreeSet<>(); // tim kiem O(logn)
		HashSet<Integer> hashSet = new HashSet<>(); // tim kiem O(logn)

		treeSet.add(3);
		treeSet.add(20);
		treeSet.add(4);
		treeSet.add(10);

		hashSet.add(3);
		hashSet.add(20);
		hashSet.add(4);
		hashSet.add(10);

		System.out.println("tree set: " + treeSet);
		System.out.println("hash set: " + hashSet);
	}

	public static void main(String[] args) {
		treeSetExample();
	}
}
