package chapter7.lap06;

public class Lap06 {
	public static void main(String[] args) {

		Engineer e = new Engineer("AI project", "duong", 21);
		Manager m = new Manager(10, "tung duong", 30);

		Person[] p = { e, m };

		for (Person person : p) {
			person.introduce();
			person.work();
			if (person instanceof Trainable) {
				((Trainable) person).attendTraining("learn java");
				((Trainable) person).feedback();
			}
			System.out.println();
		}
	}
}
