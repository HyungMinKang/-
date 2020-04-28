package school;

import java.util.ArrayList;

public class School {
	private static School instance = new School();
	private static String SCHOOL_NAME = "Good School";
	private ArrayList<Student> studentList = new ArrayList();
	private ArrayList<Subject> subjectList = new ArrayList();

	public static School getInstance() {
		if (instance == null) {
			instance = new School();
		}

		return instance;
	}

	public ArrayList<Student> getStudentList() {
		return this.studentList;
	}

	public void addStudent(Student student) {
		this.studentList.add(student);
	}

	public void addSubject(Subject subject) {
		this.subjectList.add(subject);
	}

	public ArrayList<Subject> getSubjectList() {
		return this.subjectList;
	}

	public void setSubjectList(ArrayList<Subject> subjectList) {
		this.subjectList = subjectList;
	}
}