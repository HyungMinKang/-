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
		System.out.println("택시"+taxiColor+"의 승객수는"+passengerCount
				+"명이고 수입은"+money+"입니다.");
	}
}
