package array;
import java.util.ArrayList;

public class StudentArrayList {

	public static void main(String[] args) {
		
		ArrayList<Student> school= new ArrayList<Student>();
		
		school.add(new Student("James"));
		school.add(new Student("Tomas"));
		school.add(new Student("Edward"));
		
		for(int i=0; i< school.size();i++)
		{
			Student student= school.get(i);
			student.showStudentInfo();
		}
		

	}

}
