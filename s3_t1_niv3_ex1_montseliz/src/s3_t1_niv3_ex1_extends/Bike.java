package s3_t1_niv3_ex1_extends;

public class Bike extends Vehicle {

	public Bike(int speed) {
		super(speed);
	}

	@Override
	public void startUp() {
		System.out.println("La bicicleta està en marxa.");
	}

	@Override
	public void speedUp(int quantity) {
		super.setSpeed(super.getSpeed() + quantity); 
		System.out.println("La bicicleta ha accelerat " + quantity + "km, i està anant a una velocitat de " + super.getSpeed() + " km/h.");
	}

	@Override
	public void slowDown(int quantity) {
		super.setSpeed(super.getSpeed() - quantity);
		System.out.println("La bicicleta està frenant i ha rebaixat la velocitat a " + super.getSpeed() + " Km/h.");
	}

}
