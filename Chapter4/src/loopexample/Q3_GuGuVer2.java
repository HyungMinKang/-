package loopexample;

public class Q3_GuGuVer2 {

	public static void main(String[] args) {
		int dan;
		int num;
		for(dan=2;dan<=9;dan++)
		{
			for(num=1;num<=9;num++)
			{
				if(num>dan)
					break;
				
				System.out.println(dan+"X"+num+"="+dan*num);
			}
			System.out.println();
		}

	}

}
