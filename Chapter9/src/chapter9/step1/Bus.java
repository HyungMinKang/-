package chapter9.step1;

public class Bus extends Car {
	
	@Override
	public void run() //상위클래서에서 구현된 추상메서드 구체화
	{
		System.out.println("버스가 달립니다");
	}
	
	@Override
	public void refuel()
	{
		System.out.println("천연 가스를 충전합니다");
	}
	
	
	
	public void takePassenger()
	{
		System.out.println("승객을 버스에 태움니다");
	}
}
