package chapter7.lap06;

public interface Trainable {

	void attendTraining(String topic);

	default void feedback() {
		System.out.println("Thanks for the training session.");
	}
}
