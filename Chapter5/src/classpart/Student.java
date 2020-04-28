package classpart;

public class Student {
	
	int studentID;
	String studentName;
	int grade;
	String Address;
	
	
	public void showStudentInfo()
	{
		System.out.println(studentName+","+Address);
	}
	
	public String getStudentName()
	{
		return studentName;
	}
	
	public void setStudentName(String name)
	{
		studentName=name;
	}
	
	public static void main(String[] args)
	{
		Student studentAhn=new Student();
		studentAhn.studentName="¾È¿¬¼ö";
		
		System.out.println(studentAhn.studentName);
		System.out.println(studentAhn.getStudentName());
	}
}
