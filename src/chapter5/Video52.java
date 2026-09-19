package chapter5;

public class Video52 {
	public static void main(String[] args) {

		Student sinhvien1 = new Student(); // tao ra 1 doi tuong (ban sao) cua class Student

		sinhvien1.age = 25; // dung dau "." de co the truy cap tai nguyen cua class Student
		sinhvien1.name = "hoidanit";

		System.out.println("info sv1: " + "tuoi = " + sinhvien1.age + " ten = " + sinhvien1.name);

		sinhvien1.learnJava();
	}
}
