package singleton;

public class CarFactory {
	
	
	private static CarFactory instance=new CarFactory();
	private CarFactory() {}
	public static int CarNumber=10000;
	
	public static CarFactory getInstacne()
	{
		if(instance==null)
		{
			instance=new CarFactory();
		}
		
		return instance;
	}
	
	public Car createCar()
	{
		Car car=new Car();
		return car;
	}
	
}
