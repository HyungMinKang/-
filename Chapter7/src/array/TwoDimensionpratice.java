package array;

public class TwoDimensionpratice {

	public static void main(String[] args) {
		char[][] alphabet= {{'a','b'},{'c','d'},{'e','f'},{'g','h'},{'i','j'}
		,{'k','l'},{'m','n'},{'o','p'},{'q','r'},{'s','t'},{'u','v'},{'w','x'},
		{'y','z'}};
		
		
		for(int i=0;i<alphabet.length;i++)
		{
			for(int j=0;j<alphabet[i].length;j++)
			{
				System.out.print(alphabet[i][j]);
			}
			System.out.println();
		}
	
	}
		

	

}
