package s3_t1_niv3_ex1_implementations;

import s3_t1_niv3_ex1_extends.Vehicle;
import s3_t1_niv3_ex1_interface.Operation;

public class SpeedUp implements Operation {

	private Vehicle vehicle; 
	private int quantity; 
	
	public SpeedUp(Vehicle vehicle, int quantity) {
		this.vehicle = vehicle; 
		this.quantity = quantity; 
	}
	
	@Override
	public void execute() {
		this.vehicle.speedUp(quantity);
	}

}
