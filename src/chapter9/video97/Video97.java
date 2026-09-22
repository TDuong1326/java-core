package chapter9.video97;

public class Video97 {
	public static void main(String[] args) {

		int a = 10;
		int b = 0;

		// ham try/catch dung khi can xu ly loi
		try {
			System.out.println("a/b = " + a / b);
		} catch (Exception e) {
			System.out.println("run catch: " + e.getMessage());
		}

		// ham try/catch/finally dung khi can ghi log, don dep tai nguyen
		try {

		} catch (Exception e) {

		} finally {
			// luon thuc hien cuoi cung
			System.out.println("run finally");
			// sau nay thuong dung de ghi log, ngat ket noi database, toi uu hieu nang, ...
		}

		System.out.println("end game");
	}
}
