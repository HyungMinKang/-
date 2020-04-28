package singleton;

public class Car {
	
	private static int serialNum=10000;
	private int carNum;
	
	public Car()
	{
		serialNum++;
		carNum=serialNum;
	}
	
	public int getcarNum()
	{
		return carNum;
	}
	
	public void setcarNum(int number)
	{
		this.carNum=number;
	}
}
