package innerclass;

class OutClass
{
	private int num=10;
	private static int sNum=20;
	
	private InClass inClass;
	
	public OutClass()
	{
		inClass=new InClass();
	}
	
	class InClass
	{
		int iNum=100;
		
		void inTest()
		{
			System.out.println("OutClass num = "+num+ "(외부 클래스 인스턴스 변수)");
			System.out.println("OutClass sNum = "+sNum+ "(외부 클래스 정적 변수)");
		}
		
	}
	
	public void usingClass()
	{
		inClass.inTest();
	}
}


public class InnerTest {
	public static void main(String[] args)
	{
		OutClass outClass=new OutClass();	
		
		System.out.println("외부클래스를 이용하여 내부 클래스기능 호출");
		outClass.usingClass();
	}
}
