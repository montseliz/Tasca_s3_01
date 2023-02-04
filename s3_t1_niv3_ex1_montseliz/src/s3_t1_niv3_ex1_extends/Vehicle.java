package s3_t1_niv3_ex1_extends;

// Receiver/Request
public abstract class Vehicle {

	private int speed; 
	
	public Vehicle(int speed) {
		this.speed = speed; 
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int acceleration) {
		this.speed = acceleration;
	}
	
	public abstract void startUp(); 
	
	public abstract void speedUp(int quantity); 
	
	public abstract void slowDown(int quantity); 
	
	
}
