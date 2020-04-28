package lamda;

public class CalcTest {

	public static void main(String[] args)
	{
	Calc sum= (x, y)-> x + y;
	System.out.println(sum.add(10,20));
	}
}
