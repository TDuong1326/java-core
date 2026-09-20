package chapter7.lap06;

public class Manager extends Person implements Trainable {

	private int teamSize;

	public Manager(int teamSize, String name, int age) {
		super(name, age);
		this.teamSize = teamSize;
	}

	@Override
	public void attendTraining(String topic) {
		System.out.println("Manager " + super.getName() + " is attending management training on " + topic + ".");

	}

	@Override
	void work() {
		System.out.println("Manager " + super.getName() + " is managing a team of " + this.teamSize + " people.");

	}

}
