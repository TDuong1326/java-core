package chapter8.video88;

public class Video88 {
	public static void main(String[] args) {

		System.out.println("my role = " + Role.ADMIN);
		System.out.println("my role with enum = " + MyRole.ADMIN);

		MyRole test = MyRole.ADMIN; // ENUM
//		MyRole test2 = "SUPERADMIN"; // String (he thong se bao loi)

	}
}
