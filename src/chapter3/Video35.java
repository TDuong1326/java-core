package chapter3;

public class Video35 {
	public static void main(String[] args) {
		int count = 0;
		for (int i = 1; i <= 100; i++) {
			if (i % 7 == 0) {
				count++;
				if (count == 1) {
					System.out.println("so dau tien chia het cho 7: " + i);
				} else if (count == 3) {
					System.out.println("so thu 3 chia het cho 7: " + i);
					break;
				}
			}
		}

//		for (int i = 1; i <= 10; i++) {
//			if (i % 2 == 1) {
//				continue;
//			}
//			System.out.println("cac so chan: " + i);
//		}

//		int a = 1;
//		while (a <= 10) {
//			if (a % 2 == 1) {
//				continue;
//			}
//			System.out.println("cac so chan: " + a + ", ");
//			a++;
//		}
	}
}
