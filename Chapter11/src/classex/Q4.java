package classex;

class MyDog
{
	String name;
	String type;
	
	public MyDog(String name, String type)
	{
		this.type=type;
		this.name=name;
	}
	
	public String toString()
	{
		return type+" "+name;
	}
}

public class Q4 {
	public static void main(String[] args)
	{
		MyDog dog=new MyDog("∏€∏€¿Ã","¡¯µæ∞≥");
		System.out.println(dog);
	}
}
