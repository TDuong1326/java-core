package chapter7.video78;

public class Vehicle {

	private String brand;

	public Vehicle(String brand) {
		this.brand = brand;
	}

	public void start() {
		System.out.println("Vehicle in starting...");
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}
}
