package cooperation;

public class Taxi {
	
	String taxiColor;
	int passengerCount;
	int money;
	
	public Taxi(String taxiColor)
	{
		this.taxiColor=taxiColor;
	}
	
	public void take(int money)
	{
		this.money+=money;
		passengerCount++;
	}
	
	public void showInfo()
	{
		System.out.println("�ý�"+taxiColor+"�� �°�����"+passengerCount
				+"���̰� ������"+money+"�Դϴ�.");
	}
}
