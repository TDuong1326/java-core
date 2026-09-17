package chapter3;

public class Video30 {
	public static void main(String[] args) {
		int day = 3;
		switch (day) {
		case 1:
			System.out.println("Monday");
			break;
		case 2:
			System.out.println("Tuesday");
			break;
		default:
			System.out.println("Another day");
		}

		String result = switch (day) {
		case 1 -> "Monday";
		case 2 -> "Tuesday";
		default -> "Another day";
		};
		System.out.println(result);

	}
}
