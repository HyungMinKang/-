package school;

import java.util.ArrayList;
public class Student {
	private int studentId;  //학번
	private String studentName; //학생이름
	private Subject majorSubject; // 필수 과목
	
	private ArrayList<Score> scoreList= new ArrayList<Score>(); //학생 점수 리스트
	
	public Student(int studentId, String studentName, Subject majorSubject) //멤버를 private으로 선언했기 떄문에 생성자 메서드필요
	{
		this.studentId=studentId;
		this.studentName=studentName;
		this.majorSubject=majorSubject;
	}
	
	public void addSubjectScore(Score score) //점수 리스트에 점수객체 추가
	{
		scoreList.add(score); //어레이리스트 메서드
	}

	public int getStudentId() {
		return studentId;
	}

	public void setStudentId(int studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public Subject getMajorSubject() {
		return majorSubject;
	}

	public void setMajorSubject(Subject majorSubject) {
		this.majorSubject = majorSubject;
	}

	public ArrayList<Score> getScoreList() {
		return scoreList;
	}

	public void setScoreList(ArrayList<Score> scoreList) {
		this.scoreList = scoreList;
	}
	
	
}
