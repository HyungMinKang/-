package classpart;

public class FuntctionTest {

	public static void main(String[] args) {
		int num1=10;
		int num2=20;
		
		int sum=add(num1,num2);
		System.out.println(num1+"+"+num2+"="+sum+"�Դϴ�");
		
		int dif=sub(num1,num2);
		System.out.println(num1+"-"+num2+"="+dif+"�Դϴ�");
		
		int mut=multiply(num1,num2);
		System.out.println(num1+"*"+num2+"="+mut+"�Դϴ�");
		
		double div=divide(num1,num2);
		System.out.println(num1+"/"+num2+"="+div+"�Դϴ�");
	}
	
	public static int add(int n1, int n2)
	{
		int result=n1+n2;
		return result;
	}
	
	public static int sub(int n1, int n2)
	{
		int result= n1-n2;
		return result;
	}
	
	public static int multiply(int n1, int n2)
	{
		int result=n1*n2;
		return result;
	}
	
	public static double divide(double n1, double n2)
	{
		double result=n1/n2;
		return result;
	}

}
