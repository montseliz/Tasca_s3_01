package s3_t1_niv3_ex1_extends;

public class Airplane extends Vehicle {

	public Airplane(int speed) {
		super(speed);
	}

	@Override
	public void startUp() {
		System.out.println("L'avió s'ha engegat.");
	}

	@Override
	public void speedUp(int quantity) {
		super.setSpeed(super.getSpeed() + quantity);
		System.out.println("L'avió s'ha enlairat " + quantity + "km, i està anant a una velocitat de " + super.getSpeed() + " km/h.");
	}

	@Override
	public void slowDown(int quantity) {
		super.setSpeed(super.getSpeed() - quantity);
		System.out.println("L'avió està aterrant i ha rebaixat la velocitat a " + super.getSpeed() + " Km/h.");
	}

}
