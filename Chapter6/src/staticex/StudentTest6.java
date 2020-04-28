package staticex;

public class StudentTest6 {
	
	public static void main(String[] args)
	{
		Student3 student1=new Student3();
		student1.studentName="MICK";
		System.out.println(student1.studentCardNum);
		System.out.println(student1.studentName+"학번"+student1.studentID+"학생카드번호"
				+student1.studentCardNum);
		
		Student3 student2=new Student3();
		student2.studentName="NICK";
		System.out.println(student2.studentCardNum);
		System.out.println(student2.studentName+"학번"+student2.studentID+"학생카드번호"
				+student2.studentCardNum);
	}
}
