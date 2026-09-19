package chapter6.video67;

public class Dog extends Animal {

	// khi dùng (annotation @Override) thì tên method cũng như
	// tham số truyền vào của lớp con phải giống lớp cha
	@Override
	public void makeSound() {
		System.out.println("Con cho sua gau gau");
	}
}
