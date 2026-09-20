package chapter7.video78;

public class Video78 {
	public static void main(String[] args) {

		Car myCar = new Car("Toyota");
		Bus myBus = new Bus("Vin");
		Motorbike myMotor = new Motorbike("Honda");

		Vehicle[] ve = { myCar, myBus, myMotor };

		for (Vehicle vehicle : ve) {
			vehicle.start();
		}
	}
}
