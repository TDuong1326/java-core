package chapter10.video114;

import java.util.HashSet;

public class Video114 {
	public static void main(String[] args) {

		Product p1 = new Product(1, "Laptop", 1500.0);
		Product p2 = new Product(2, "Mouse", 20.0);
		Product p3 = new Product(3, "Keyboard", 45.0);
		Product p4 = new Product(1, "Laptop Pro", 2000.0);
		Product p5 = new Product(1, "Laptop", 1500.0);

		HashSet<Product> product = new HashSet<>();

		product.add(p1);
		product.add(p2);
		product.add(p3);
		product.add(p4);
		product.add(p5);

		for (Product pd : product) {
			System.out.println(pd);
		}
	}
}
