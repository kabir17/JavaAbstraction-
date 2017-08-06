package abstruction;

public class TestCar {

	public static void main(String[] args) {
		
		// create concrete class
		
		MotorCar motorCar = new Car();
		motorCar.engine();
		
		Car toyota = new Car();
		toyota.bodyshape();
		toyota.start();
		toyota.stop();
		toyota.solarEngine();
		toyota.electricCar();
		
		
	
	}

}
