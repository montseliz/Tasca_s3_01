package s3_t1_niv3_ex1_implementations;

import s3_t1_niv3_ex1_extends.Vehicle;
import s3_t1_niv3_ex1_interface.Operation;

public class StartUp implements Operation {

	private Vehicle vehicle; 
	
	public StartUp(Vehicle vehicle) {
		this.vehicle = vehicle; 
	}
	
	@Override
	public void execute() {
		this.vehicle.startUp();
	}

}
