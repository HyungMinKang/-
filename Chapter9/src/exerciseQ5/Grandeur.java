package exerciseQ5;

public class Grandeur extends Car {

	String car="Grandeur";
	@Override
	public void start()
	{
		System.out.println(car+"�õ��� �մϴ�");
	}
	
	@Override 
	public void drive()
	{
		System.out.println(car+ "�޸��ϴ�.");
	}
	
	@Override
	public void stop()
	{
		System.out.println(car+ "����ϴ�");
	}
	
	@Override
	public void turnoff()
	{
		System.out.println(car +" �õ��� ���ϴ�");
	}
	
}

