package innerclass;


class Outer2
{
	
	Runnable getRunnable(int i)
	{
		int num=100;
		
		
		return new Runnable() {
			
			@Override
			public void run()
			{
				System.out.println(i);
				System.out.println(num);
			}
		};
		
	}
	Runnable runner= new Runnable()
			
	{
		@Override
		public void run()
		{
			System.out.println("Runnable이 구현돈 익명 클래스 변수");
		}
	};
}

public class AnnonymousInnerTest {
	public static void main(String[] args)
	{
		Outer2 out= new Outer2();
		Runnable runner= out.getRunnable(10);
		runner.run();
		out.runner.run();
	}
}

