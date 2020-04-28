package staticex;

public class Student2 {
	
	private static int serialNum=1000;
	int studentID;
	String studentName;
	int grade;
	String address;
	
	public Student2()
	{
		serialNum++;
		studentID=serialNum;
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName=name;
	}
	
	public static int getSerialNum() //클래스 메서드 외부클래스에서 serialNum접근
	{
		int i=10;
		return serialNum;
	}
	
	public static void setSerialNum(int serialNum) //외부클래스에서 serialNum 수정
	{
		Student2.serialNum=serialNum;
	}
}
