package chapter8.video91;

public class Person {

	private String name;
	private int age;

	public Person(String name, int age) {
		this.age = age;
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	static class UserId {

		private String cccd;
		private String address;

		public UserId(String cccd, String address) {
			this.address = address;
			this.cccd = cccd;
		}

		// khi dung static nested class thi khong the truy cap duoc 1 tham so khong
		// phai la static thuoc lop ngoai (name) => function k dung duoc
//		public void printInfo() {
//			System.out.println("Outsides name: " + name);
//		} 

		public String getCccd() {
			return cccd;
		}

		public void setCccd(String cccd) {
			this.cccd = cccd;
		}

		public String getAddress() {
			return address;
		}

		public void setAddress(String address) {
			this.address = address;
		}

	}
}
