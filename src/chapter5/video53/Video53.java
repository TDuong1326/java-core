package chapter5.video53;

public class Video53 {
	public static void main(String[] args) {
		Student sv1 = new Student();

		sv1.sleep();
		sv1.onThi();

//		System.out.println(sv1.sum(3, 5));

		int testSum = sv1.sum(3, 5);
		System.out.println("testSum = " + testSum);
	}
}
