package stream.inputstream;

import java.io.IOException;
public class SystemInTest {

	public static void main(String[] args) throws IOException{
		System.out.println("알파벳을 하나 쓰고 [Enter]을 누르세요");
		
		int i;
		try {
			i=System.in.read();
			System.out.println(i);
			System.out.println((char)i);
		}catch (IOException e)
		{
			e.printStackTrace();
		}

	}

}
