package chapter4;

public class Video44 {
	public static void main(String[] args) {
		String name = "hoidanit Hello World";
		System.out.println("length: " + name.length()); // chieu dai

		System.out.println("name: " + name.toUpperCase()); // all chu hoa

		System.out.println("location: " + name.indexOf('h')); // tim vi tri cho ky tu

		System.out.println("index: " + name.charAt(0)); // tim ky tu theo vi tri

		System.out.println("subString: " + name.substring(0, 8)); // cat chuoi

		System.out.println("name: " + name.toLowerCase()); // all chu thuong

		System.out.println("name: " + name.contains("hoidan")); // check true/false cho chuoi

	}
}
