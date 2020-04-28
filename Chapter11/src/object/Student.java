package object;

class Studentinf {
	
	int studentID;
	String studentName;
	
	Studentinf(int studentID, String studentName)
	{
		this.studentID=studentID;
		this.studentName=studentName;
	}
	
	@Override
	public String toString()
	{
		return studentID+","+ studentName;
	}
}

public class Student{
	public static void main(String[] args)
	{
		Studentinf std1= new Studentinf(10001, "±è´ö¹è");
		System.out.println(std1.toString());
	}
}

