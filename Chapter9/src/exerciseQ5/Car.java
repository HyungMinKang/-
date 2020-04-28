package exerciseQ5;

public abstract class Car {
	
	public abstract void start();
	public abstract void drive();
	public abstract void stop();
	public abstract void turnoff();
	
	public void washCar()
	{
		System.out.println("세차를 합니다");
	}
	
	final void run()
	{
		
		start();
		drive();
		stop();
		turnoff();
		washCar();
	}
	

}
