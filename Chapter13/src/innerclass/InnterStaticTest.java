package innerclass;


class OutClasss
{
	private int num=10;
	private static int sNum=20;
	

	
	static class InStaticClass
	{
		int inNum=100;
		static int sInNum=200;
		
		void inTest() //���� ���� Ŭ������ �Ϲ� �ż���=  ����Ŭ������ ��� �ν��Ͻ� ��� ����+  �ܺ�Ŭ������ ���� ���� ��밡��
		{
			System.out.println("InStaticClass inNum= "+ inNum+ "(����Ŭ������ �ν��Ͻ� ���� ���)");
			System.out.println("InStaticClass sInNUm"+ sInNum+ "(����Ŭ������ �������� ���)");
			System.out.println("OutClass sNum= "+ sNum + "(�ܺ�Ŭ������ ���� ���� ���)");
		}
		
		static void sTest() //���� ����Ŭ������ ���� �ż���= ����/�ܺ� ���������� ��밡��
		{
			System.out.println("OutClass sNum= "+ sNum + "(�ܺ�Ŭ������ ���� ���� ���)");
			System.out.println("InStaticClass sInNUm"+ sInNum+ "(����Ŭ������ �������� ���)");
		}
		
	}
	
	
}



public class InnterStaticTest {
	public static void main(String[] args)
	{	
		
		OutClasss.InStaticClass sInClass= new OutClasss.InStaticClass();
		System.out.println("���� ���� Ŭ���� �Ϲ� �ż��� ȣ��");
		sInClass.inTest();
		
		System.out.println();
		System.out.println("���� ���� Ŭ���� ���� �޼��� ȣ��");
		OutClasss.InStaticClass.sTest();
	}
}
