package chapter10.video111;

import java.util.ArrayList;

public class Video111 {
	public static void main(String[] args) {

//		List, ArrayList, LinkedList

		ArrayList<Student> student = new ArrayList<>();
//		List<String> test = new ArrayList<>(); // day la cach code (upcasting) theo tinh da hinh(polymophism)

		Student st = new Student("duong", 21);
		Student st2 = new Student("tung duong", 25);
		Student st3 = new Student("nguyen tung duong", 30);

		student.add(st);
		student.add(st2);
		student.add(st3);

		for (Student stu : student) {
			System.out.println(stu); // khong can dung stu.toString vi java tu thuc hien
		}
		System.out.println();

		Student st4 = new Student("NTD", 100);
		student.add(1, st4);
		for (Student stu : student) {
			System.out.println(stu);
		}
		System.out.println();

		student.remove(0);
		for (Student stu : student) {
			System.out.println(stu);
		}
	}
}
