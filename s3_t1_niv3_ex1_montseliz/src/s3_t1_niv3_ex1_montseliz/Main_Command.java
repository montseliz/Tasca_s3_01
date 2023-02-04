package s3_t1_niv3_ex1_montseliz;

import s3_t1_niv3_ex1_extends.Airplane;
import s3_t1_niv3_ex1_extends.Bike;
import s3_t1_niv3_ex1_extends.Boat;
import s3_t1_niv3_ex1_extends.Car;
import s3_t1_niv3_ex1_implementations.SlowDown;
import s3_t1_niv3_ex1_implementations.SpeedUp;
import s3_t1_niv3_ex1_implementations.StartUp;


public class Main_Command {

	public static void main(String[] args) {
		
		Car car = new Car(70); 
		Bike bike = new Bike(10); 
		Airplane airplane = new Airplane(500); 
		Boat boat = new Boat(20); 
		Invoker invoker = new Invoker(); 
		
		car.startUp();
		car.speedUp(50);
		car.slowDown(20);
		
		System.out.println("");
		
		bike.startUp();
		bike.speedUp(5);
		bike.slowDown(10);
		
		System.out.println("");
		
		SpeedUp speedCar = new SpeedUp(car, 10); 
		SlowDown slowCar = new SlowDown(car, 50); 
		
		invoker.receiveOperation(speedCar);
		invoker.receiveOperation(slowCar);
		invoker.doOperation();
		
		System.out.println("");
		
		SpeedUp speedBike = new SpeedUp(bike, 5); 
		SlowDown slowBike = new SlowDown(bike, 10); 
		
		invoker.receiveOperation(speedBike);
		invoker.receiveOperation(slowBike);
		invoker.doOperation();
		
		System.out.println("");
		
		StartUp startAirplane = new StartUp(airplane); 
		SpeedUp speedAirplane = new SpeedUp(airplane, 2000); 
		SlowDown slowAirplane = new SlowDown(airplane, 1000); 
		
		invoker.receiveOperation(startAirplane);
		invoker.receiveOperation(speedAirplane);
		invoker.receiveOperation(slowAirplane);
		invoker.doOperation();
		
		System.out.println("");
		
		StartUp startBoat = new StartUp(boat); 
		SpeedUp speedBoat = new SpeedUp(boat, 20); 
		SlowDown slowBoat = new SlowDown(boat, 10); 
		
		invoker.receiveOperation(startBoat);
		invoker.receiveOperation(speedBoat);
		invoker.receiveOperation(slowBoat);
		invoker.doOperation();
		
	}

}
