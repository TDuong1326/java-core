package chapter6.video66;

public class Car extends Vehicle {
	String type;

	public Car(String type, String brand, int year) {
		super(brand, year);
		this.type = type;
		System.out.println("run constructor Car");
	}

	public String getType() {
		return this.type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return this.brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public int getYear() {
		return this.year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void printInfo() {
		super.printInfo();
		System.out.println("Info: type = " + this.type);
	}
}
