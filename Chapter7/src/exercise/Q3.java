package exercise;

public class Q3 {

	public static void main(String[] args) {
		int[] arr= new int[5];
		int num=1;
		int sum=0;
		for(int i=0; i<arr.length;i++,num++)
		{
			while(num%2!=0)
			{
				num++;
			}
			
			arr[i]=num;
			sum+=arr[i];
		}
		
		System.out.println(sum);
		
 
	}

}
