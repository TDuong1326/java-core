package chapter9.video99;

public class Video99 {
//	    public static int chia2SoNguyen(int a, int b) {
//
	// Trong Java, khi bạn truyền một đối tượng vào hàm System.out.println(object),
	// Java sẽ tự động gọi hàm .toString() của đối tượng đó, do vậy exception e
	// se hung lay doi tuong new exception va gan cho exception e
//		try {
//			if (b == 0) {
//				throw new Exception("Lỗi chia cho 0");
//			}
//		} catch (Exception e) {
//			System.out.println(e);
//		}
//		return a / b;
//	}

	public static int chia2SoNguyen(int a, int b) throws Exception {

		if (b == 0) {
			throw new Exception("Lỗi chia cho 0");
		}
		return a / b;
	}

	public static void main(String[] args) throws Exception {

		System.out.println("ket qua chia = " + chia2SoNguyen(10, 0));
	}
}
