package school;
import java.util.ArrayList;

import utills.Define;

public class Subject {

	private String subjectName; //�����̸�
	private int subjectId; // ������� ��ȣ
	private int gradeType; //���� ��
	
	private ArrayList<Student> studentList= new ArrayList<Student>(); //�� ������ �����ϴ� �������� �л��� �������ִ�
	
	public Subject(String subjectName, int subjectId)
	{
		this.subjectName=subjectName;
		this.subjectId=subjectId;
		this.gradeType=Define.AB_TYPE;  //���� �� ��å�� �ʼ�����(A) �ʼ�����ƴϴ�(B)�� ��������
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
	
	public void register(Student student) //������û �޼���
	{
		studentList.add(student);
	}
}
