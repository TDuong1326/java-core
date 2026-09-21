package chapter8.video91;

public class Video91 {
	public static void main(String[] args) {

		Person tungduong = new Person("duong", 21);

		// su dung object outer de khai bao doi tuong lop con
//		Person.UserId myData = tungduong.new UserId("123", "Thanh Hoa");
		Person.UserId myData = new Person.UserId("123", "Thanh Hoa");

		System.out.println("check person name: " + tungduong.getName());
		System.out.println("check my Data: " + myData.getCccd() + ", " + myData.getAddress());

//		myData.printInfo();
	}
}
