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
		Student1 studentLee= new Student1(100,"�̻��");
		Student1 studentLee2=studentLee;
		Student1 studentSang=new Student1(100,"�̻��");
		
		if(studentLee==studentLee2)
			System.out.println("studentLee�� studentLee2�� �ּҴ� �����ϴ�");
		else
			System.out.println("studentLee�� studentLee2�� �ּҴ� �ٸ��ϴ�");
		
		if(studentLee.equals(studentLee2))
			System.out.println("studentLee�� studentLee2�� �����մϴ�");
		else
			System.out.println("studentLee�� studentLee2�� �������� �ʽ��ϴ�");
		
		if(studentLee==studentSang)
			System.out.println("studentLee�� studengSang�� �ּҴ� �����ϴ�");
		else
			System.out.println("studentLee�� studentSang�� �ּҴ� �ٸ��ϴ�");
		
		if(studentLee.equals(studentSang))
			System.out.println("studentLee�� studentSang�� �����մϴ�");
		else
			System.out.println("studentLee�� studentSang�� �������� �ʽ��ϴ�");
		
		System.out.println("studentLee�� hashCode:"+studentLee.hashCode());
		System.out.println("studentSang�� hashCode"+studentSang.hashCode());
		
		System.out.println("studentLee�� �����ּҰ�:"+System.identityHashCode(studentLee));
		System.out.println("studentSang�� �����ּҰ�"+System.identityHashCode(studentSang));
	}
	
}
