package chapter7.video81;

public class Bird implements Flyable, Animal {

	@Override
	public void doFly() {
		System.out.println("chim bay bang canh");

	}

	@Override
	public void makeSound() {
		System.out.println("chim keu chip chip");

	}

}
