package chapter5.video55;

public class Video55 {
	public static void main(String[] args) {
		System.out.println("video 55");

		Student st1 = new Student("duong", 21);
		Student st2 = new Student("tung duong", 27);

		System.out.println("check student 1: " + st1.name);
		System.out.println("check student 2: " + st2.name);

		Student st3 = new Student();
		st3.name = "nguyen tung duong";
		System.out.println("check student 2: " + st3.name);
		// neu minh khong viet ham tao thi java se tu tao ra ham tao k co tham so truyen
		// vao

	}
}
