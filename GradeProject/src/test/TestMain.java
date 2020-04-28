package test;

import school.School;
import school.Score;
import school.Student;
import school.Subject;
import school.report.GenerateGradeReport;

public class TestMain {
	School goodSchool = School.getInstance();
	Subject korean;
	Subject math;
	GenerateGradeReport gradeReport = new GenerateGradeReport();

	public static void main(String[] args) {
		TestMain test = new TestMain();
		test.creatSubject();
		test.createStudent();
		String report = test.gradeReport.getReport();
		System.out.println(report);
	}

	public void creatSubject() {
		this.korean = new Subject("국어", 1001);
		this.math = new Subject("수학", 2001);
		this.goodSchool.addSubject(this.korean);
		this.goodSchool.addSubject(this.math);
	}

	public void createStudent() {
		Student student1 = new Student(181213, "안성원", this.korean);
		Student student2 = new Student(181518, "오태훈", this.math);
		Student student3 = new Student(171230, "이동호", this.korean);
		Student student4 = new Student(171255, "조성욱", this.korean);
		Student student5 = new Student(171590, "최태평", this.math);
		this.goodSchool.addStudent(student1);
		this.goodSchool.addStudent(student2);
		this.goodSchool.addStudent(student3);
		this.goodSchool.addStudent(student4);
		this.goodSchool.addStudent(student5);
		this.korean.register(student1);
		this.korean.register(student2);
		this.korean.register(student3);
		this.korean.register(student4);
		this.korean.register(student5);
		this.math.register(student1);
		this.math.register(student2);
		this.math.register(student3);
		this.math.register(student4);
		this.math.register(student5);
		this.addScoreForStudent(student1, this.korean, 95);
		this.addScoreForStudent(student1, this.math, 56);
		this.addScoreForStudent(student2, this.korean, 95);
		this.addScoreForStudent(student2, this.math, 95);
		this.addScoreForStudent(student3, this.korean, 100);
		this.addScoreForStudent(student3, this.math, 88);
		this.addScoreForStudent(student4, this.korean, 89);
		this.addScoreForStudent(student4, this.math, 95);
		this.addScoreForStudent(student5, this.korean, 85);
		this.addScoreForStudent(student5, this.math, 56);
	}

	public void addScoreForStudent(Student student, Subject subject, int point) {
		Score score = new Score(student.getStudentId(), subject, point);
		student.addSubjectScore(score);
	}
}
