package innerstaticclass;



class OutClass
{
	
	private static int sNum=20;
	

	
	static class InStaticClass
	{
		int inNum=100;
		static int sInNum=200;
		
		void inTest() //정적 내부 클래스의 일반 매서드=  내부클래스이 모든 인스턴스 사용 가능+  외부클래스이 정적 변수 사용가능
		{
			System.out.println("InStaticClass inNum= "+ inNum+ "(내부클래스의 인스턴스 변수 사용)");
			System.out.println("InStaticClass sInNUm"+ sInNum+ "(내부클래스의 정적변수 사용)");
			System.out.println("OutClass sNum= "+ sNum + "(외부클래스의 정적 변수 사용)");
		}
		
		static void sTest() //정적 내부클래스이 정적 매서드= 내부/외부 정적변수만 사용가능
		{
			System.out.println("OutClass sNum= "+ sNum + "(외부클래스의 정적 변수 사용)");
			System.out.println("InStaticClass sInNUm"+ sInNum+ "(내부클래스의 정적변수 사용)");
		}
		
	}
	
	
}



public class InnerStaticTest {
	public static void main(String[] args)
	{	
		
		OutClass.InStaticClass sInClass= new OutClass.InStaticClass();
		System.out.println("정적 내부 클래스 일반 매서드 호출");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("정적 내부 클래스 정적 메서드 호출");
		OutClass.InStaticClass.sTest();
	}
}
