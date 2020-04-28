package exercise;

public class Alpha {

	public static void main(String[] args) {
		
		char[] alpha= new char[26];
		char ch='a';
		
		for(int i=0; i<alpha.length;i++,ch++)
		{
			alpha[i]=ch;
			
		}
		
		for(int i=0; i<alpha.length;i++)
		{
			alpha[i]=(char)(alpha[i]-32);
			
		}
		
		for(int i=0 ; i<alpha.length; i++, ch++){
			System.out.println(alpha[i]);
		
		}

	}

}
