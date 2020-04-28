package loopexample;

public class Q4 {

	public static void main(String[] args) {
		int i;
		int j;
		for(i=1; i<=4; i++)
		{
			int count=2*i-1;
			for(j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=count; j++)
			{
				System.out.print("*");
			}
			System.out.println();
			
		}
		
		for(i=3;i>=1;i--)
		{
			int count=2*i-1;
			for(j=1;j<=4-i;j++)
			{
				System.out.print(" ");
			}
			for(j=1; j<=count; j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
