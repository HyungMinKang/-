package array;

public class Student {
	
	public static int serialNum=1000;
	private int studentID;
	private String name;
	
	public int getStudentID() {
		return studentID;
	}

	public void setStudentID() {
		serialNum++;
		this.studentID = serialNum;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Student() {};
	
	public Student(String name)
	{
		setStudentID();
		this.name=name;
	}
	
	public void showStudentInfo()
	{
		System.out.println(studentID+","+name);
	}
}
