package chapter10.lap09;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;

public class Lap09 {

	public static void arrayListEx() { // Dam bao theo thu tu dau vao va cho phep trung
		ArrayList<Member> members = new ArrayList<>();

		Member m1 = new Member(1, "tung duong", 21);
		Member m2 = new Member(2, "trang", 21);
		Member m3 = new Member(3, "em bun", 23);
		Member m4 = new Member(4, "eric", 30);
		Member m5 = new Member(5, "adam", 20);

		members.add(m1);
		members.add(m2);
		members.add(m3);
		members.add(m4);
		members.add(m5);

		for (Member member : members) {
			System.out.println(member);
		}

	}

	public static void hashSetEx() { // Khong dam bao thu tu dau vao va khong trung

		HashSet<Member> memberIDs = new HashSet<>();

		Member m1 = new Member(1, "tung duong", 21);
		Member m2 = new Member(2, "trang", 21);
		Member m3 = new Member(1, "em bun", 23);
		Member m4 = new Member(4, "eric", 30);
		Member m5 = new Member(2, "adam", 20);

		memberIDs.add(m1);
		memberIDs.add(m2);
		memberIDs.add(m3);
		memberIDs.add(m4);
		memberIDs.add(m5);

		// in ra ca ten va id
		for (Member member : memberIDs) {
			System.out.println(member);
		}
	}

	public static void treeSetEx() { // Dam bao theo thu tu theo dkien ham compareTo vao va khong cho phep trung
		TreeSet<Member> rankedMembers = new TreeSet<>();

		Member m1 = new Member(1, "tung duong", 21);
		Member m2 = new Member(2, "trang", 21);
		Member m3 = new Member(1, "em bun", 23);
		Member m4 = new Member(4, "eric", 30);
		Member m5 = new Member(2, "adam", 20);

		rankedMembers.add(m1);
		rankedMembers.add(m2);
		rankedMembers.add(m3);
		rankedMembers.add(m4);
		rankedMembers.add(m5);

		for (Member member : rankedMembers) {
			System.out.println(member);
		}
	}

	public static void hashMapEx() { // Khong dam bao thu tu dau vao va khong cho phep trung

		HashMap<Integer, Integer> pointMap = new HashMap<>();

		pointMap.put(1, 11);
		pointMap.put(2, 5);
		pointMap.put(1, 7); // ghi de len vi tri trung key truoc do
		pointMap.put(16, 8);
		pointMap.put(7, 2);

		if (pointMap.containsKey(1)) {
			int currentPoint = pointMap.get(1);
			pointMap.put(1, currentPoint + 10);
		}

		for (Map.Entry<Integer, Integer> entry : pointMap.entrySet()) {
			System.out.println("ID = " + entry.getKey() + ", Point = " + entry.getValue());
		}
	}

	public static void treeMapEx() { // Sap xep thu tu theo key va khong cho phep trung
		ArrayList<Member> members = new ArrayList<>();
		Member m1 = new Member(2, "tung duong", 21);
		Member m2 = new Member(1, "trang", 21);
		Member m3 = new Member(1, "em bun", 23);
		Member m4 = new Member(4, "eric", 30);
		Member m5 = new Member(3, "adam", 20);

		TreeMap<Integer, String> idNameMap = new TreeMap<>();

		idNameMap.put(m1.getId(), m1.getName());
		idNameMap.put(m2.getId(), m2.getName());
		idNameMap.put(m3.getId(), m3.getName());
		idNameMap.put(m4.getId(), m4.getName());
		idNameMap.put(m5.getId(), m5.getName());

		for (Map.Entry<Integer, String> entry : idNameMap.entrySet()) {
			System.out.println("ID = " + entry.getKey() + ", Name = " + entry.getValue());
		}

	}

	public static void main(String[] args) {

		arrayListEx();
		System.out.println();

		hashSetEx();
		System.out.println();

		treeSetEx();
		System.out.println();

		hashMapEx();
		System.out.println();

		treeMapEx();
		System.out.println();
	}
}
