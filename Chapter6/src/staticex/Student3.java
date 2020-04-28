package staticex;

public class Student3 {
	
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int studentCardNum;
	
	
	public Student3()
	{
		serialNum++;
		studentID=serialNum;
		studentCardNum=studentID+100;
	}
	
	public int getstudentCardNum()
	{
		return studentCardNum;
	}
	
	
	
	public static int getSerialNum()
	{
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum)
	{
		Student3.serialNum=serialNum;
	}
}
