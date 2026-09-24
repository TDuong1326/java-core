package chapter10.video109;

import java.util.ArrayList;

public class Video109 {
	public static void main(String[] args) {

		// khi su dung interface thi ta chi duoc thao tac voi doi tuong
		ArrayList<String> tungduong = new ArrayList<>(); // diamond operater
		tungduong.add("Thanh Hoa"); // ["Thanh Hoa"]
		tungduong.add("Ha Noi"); // ["Thanh Hoa", "Ha Noi"]
		tungduong.add("Da Nang"); // ["Thanh Hoa", "Ha Noi", "Da Nang"]

		for (String item : tungduong) {
			System.out.println(item);
		}

//		ArrayList<int> test = new ArrayList(); sai do int khong phai la object (doi tuong)
		ArrayList<Integer> test = new ArrayList<>();

		// java tu dong dua ve kieu du lieu object, nhung theo goc nhin cua ltv thi cta
		// van thao tac voi kieu du lieu nguyen thuy
		test.add(1);
		test.add(0);
		for (int integer : test) {
			System.out.println(integer);
		}

	}
}
