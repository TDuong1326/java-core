package chapter5.video56;

public class Product {
	String name;
	double price;

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	void display() {
		System.out.println("thong tin san pham: ten = " + this.name + " va gia = " + this.price);
	}
}
