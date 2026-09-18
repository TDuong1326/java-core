package chapter4;

public class Video45 {
	public static void main(String[] args) {
		String a = "hello";
		String b = new String("hello");

		System.out.println("a = " + a + "b = " + b);
		System.out.println(a == b); // đây là đang so sánh địa chỉ bộ nhớ chứ k phải ss giá trị (false)
		System.out.println(a.equals(b)); // true

	}
}
