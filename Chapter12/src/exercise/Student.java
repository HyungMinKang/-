package exercise;

public class Student {
	
	String studentId;
	String studentName;
	
	public Student(String studentId, String studentName)
	{
		this.studentId=studentId;
		this.studentName=studentName;
	}
	
	public int hashCode()
	{
		return  Integer.parseInt(this.studentId);
	}
	
	public boolean equals(Object obj)
	{
		if(obj instanceof Student)
		{
			Student student= (Student)obj;
			if(this.studentId==student.studentId)
			{
				return true;
			}
			else
			{
				return false;
			}
		}
		return false;
	}
	
	public String toString() {
		return this.studentId + ":" + this.studentName;
	}
}
