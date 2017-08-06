package abstruction;

public abstract class MotorCar {
	//create abstract 
	static int color =20;
	public void engine(){
		System.out.println("Lets implement th engine");
	}
	public void wheel(){
		System.out.println("It has 4 wheel drive ");
	}
	public abstract void electricCar();
	
	public void solarEngine(){
		System.out.println("Run on battery");
	}
}