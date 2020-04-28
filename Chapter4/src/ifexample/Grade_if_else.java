package ifexample;

public class Grade_if_else {

	public static void main(String[] args) {
		int score=40;
		char grade;
		
		if(score>=90 &&score<=100)
		{
			grade='A';
		}
		else if(score>=80)
		{
			grade='B';
		}
		else if(score>=70)
		{
			grade='C';
		}
		else if(score>=60)
		{
			grade='D';
		}
		else
		{
			grade='F';
		}
		
		System.out.println(grade);
	}

}
