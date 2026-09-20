package chapter7.video76;

public class Video76 {
	public static void main(String[] args) {

		Animal a = new Animal(); // khai bao mot doi tuong
		Dog myDog = new Dog(); // .....

		Animal test = new Dog(); // da hinh (upcasting)
		Dog test2 = (Dog) test; // da (downcasting)

		System.out.println(test.getClass());
		test.makeSound(); // chi goi den method lop con khi co @Override
		test2.wagTail();

	}
}
