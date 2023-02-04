package s3_t1_niv3_ex1_extends;

public class Car extends Vehicle {

	public Car(int speed) {
		super(speed);
	}

	@Override
	public void startUp() {
		System.out.println("El cotxe s'ha engegat.");
	}

	@Override
	public void speedUp(int quantity) {
		super.setSpeed(super.getSpeed() + quantity);
		System.out.println("El cotxe ha accelerat " + quantity + "km, i està anant a una velocitat de " + super.getSpeed() + " km/h.");
	}

	@Override
	public void slowDown(int quantity) {
		super.setSpeed(super.getSpeed() - quantity);
		System.out.println("El cotxe està frenant i ha rebaixat la velocitat a " + super.getSpeed() + " Km/h.");
	}

}
