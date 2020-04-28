package object;

class Student1
{
	int studentId;
	String studentName;
	
	public Student1(int studentId, String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public String toString()
	{
		return studentId+","+studentName;
	}
	
	@Override
	public boolean equals(Object obj)
	{
		if(obj instanceof Student1)
		{
			Student1 std=(Student1)obj;
			if(this.studentId==std.studentId)
				return true;
			else
				return false;
		}
		return false;
	}
	
	@Override
	public int hashCode()
	{
		return studentId;
	}
}


public class EqualTest {
	public static void main(String[] args)
	{
		Student1 studentLee= new Student1(100,"이상원");
		Student1 studentLee2=studentLee;
		Student1 studentSang=new Student1(100,"이상원");
		
		if(studentLee==studentLee2)
			System.out.println("studentLee와 studentLee2의 주소는 같습니다");
		else
			System.out.println("studentLee와 studentLee2의 주소는 다릅니다");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee와 studentLee2는 동일합니다");
		else
			System.out.println("studentLee와 studentLee2는 동일하지 않습니다");
		
		if(studentLee==studentSang)
			System.out.println("studentLee와 studengSang의 주소는 같습니다");
		else
			System.out.println("studentLee와 studentSang의 주소는 다릅니다");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee와 studentSang은 동일합니다");
		else
			System.out.println("studentLee와 studentSang은 동일하지 않습니다");
		
		System.out.println("studentLee의 hashCode:"+studentLee.hashCode());
		System.out.println("studentSang의 hashCode"+studentSang.hashCode());
		
		System.out.println("studentLee의 실제주소값:"+System.identityHashCode(studentLee));
		System.out.println("studentSang의 실제주소값"+System.identityHashCode(studentSang));
	}
	
}
