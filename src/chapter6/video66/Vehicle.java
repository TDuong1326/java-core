package chapter6.video66;

public class Vehicle {

	String brand;
	int year;

	public Vehicle(String brand, int year) {
		this.brand = brand;
		this.year = year;
		System.out.println("run constructor Vehicle");
	}

	public void printInfo() {
		System.out.println("Info: brand = " + this.brand + ", year = " + this.year);
	}

}
