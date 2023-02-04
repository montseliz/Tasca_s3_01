package s3_t1_niv3_ex1_montseliz;

import java.util.ArrayList;

import s3_t1_niv3_ex1_interface.Operation;

// Invoker
public class Invoker {

	private ArrayList<Operation> listOperation = new ArrayList<>(); 
	
	public void receiveOperation(Operation operation) {
		this.listOperation.add(operation);
	}
	
	public void doOperation() {
		this.listOperation.forEach(o -> o.execute());
		this.listOperation.clear();
	}

}
