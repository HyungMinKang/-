package school;
import java.util.ArrayList;

import utills.Define;

public class Subject {

	private String subjectName; //과목이름
	private int subjectId; // 과목고유 번호
	private int gradeType; //학점 평가
	
	private ArrayList<Student> studentList= new ArrayList<Student>(); //한 과목은 수강하는 여러명의 학생을 가질수있다
	
	public Subject(String subjectName, int subjectId)
	{
		this.subjectName=subjectName;
		this.subjectId=subjectId;
		this.gradeType=Define.AB_TYPE;  //학점 평가 정책은 필수과목(A) 필수과목아니다(B)로 나누어짐
	}

	public String getSubjectName() {
		return subjectName;
	}

	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}

	public int getSubjectId() {
		return subjectId;
	}

	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}

	public int getGradeType() {
		return gradeType;
	}

	public void setGradeType(int gradeType) {
		this.gradeType = gradeType;
	}

	public ArrayList<Student> getStudentList() {
		return studentList;
	}

	public void setStudentList(ArrayList<Student> studentList) {
		this.studentList = studentList;
	}
	
	public void register(Student student) //수강신청 메서드
	{
		studentList.add(student);
	}
}
