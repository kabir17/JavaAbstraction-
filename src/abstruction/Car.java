package abstruction;
 // doing extends and implements on concrete class
public class Car extends MotorCar implements TravelVehicle  {
	
	public void bodyshape(){
		System.out.println("The car is 6 feet long");
	}
 
	@Override
	public void start() {
		System.out.println("Run slowly");
		
	}

	@Override
	public void stop() {
		System.out.println("stop it");
		
	}

	@Override
	public void electricCar() {
		System.out.println("automated");
		
	}
	public void fly(){
		System.out.println("that car can fly");
	}

}
