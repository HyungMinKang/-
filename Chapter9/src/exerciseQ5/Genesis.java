package exerciseQ5;

public class Genesis extends Car{
	
	String car="Genesis";
	@Override
	public void start()
	{
		System.out.println(car+"시동을 켭니다");
	}
	
	@Override 
	public void drive()
	{
		System.out.println(car+ "달립니다.");
	}
	
	@Override
	public void stop()
	{
		System.out.println(car+ "멈춥니다");
	}
	
	@Override
	public void turnoff()
	{
		System.out.println(car +"시동을 끕니다");
	}
	
}
