package loopexample;

public class Q2_EvenGugu {

	public static void main(String[] args) {
		int dan;
		int num;
		for(dan=2;dan<=9;dan++)
		{	
			if(dan%2!=0)
				continue;
			for(num=1;num<=9;num++)
			{
				System.out.println(dan+"X"+num+"="+dan*num);
			}
			System.out.println();
		}

	}

}
