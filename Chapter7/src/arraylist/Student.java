package arraylist;

import java.util.ArrayList;

public class Student {
	
	int studentID;
	String studentName;
	ArrayList <Subject> subjectList;
	int index;
	
	
	public Student(int studentID, String studentName)
	{
		this.studentID=studentID;
		this.studentName=studentName;
		subjectList=new ArrayList<Subject>(); //배열리스트 생성
	} //생성자
	
	public void addSubject(String name,int score)
	{
		Subject subject =new Subject(); 
		
		subject.setName(name); 
		subject.setScorePoint(score); //점수 추가하기
		subjectList.add(subject);
	}
	
	public void showStudentInfo()
	{
		int total=0;
		for(Subject s:subjectList)
		{
			total+=s.getScorePoint();
			System.out.println("학생 "+studentName+"의 "+s.getName()+
					"과목성적은 "+s.getScorePoint()+"입니다");
		}
		
		System.out.println("학생 "+studentName+"의 총점은"+total+" 입니다");
	}

}
