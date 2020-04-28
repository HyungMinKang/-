package array;

public class StudentArray {

	public static void main(String[] args) {
		
		Student[] stdinf= new Student[3];
		stdinf[0]=new Student("James");
		stdinf[1]=new Student("Tomas");
		stdinf[2]=new Student("Edward");
		
		for(int i=0;i<stdinf.length;i++)
		{
			stdinf[i].showStudentInfo();
		}

	}

}
