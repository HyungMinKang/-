package exception;

import java.io.FileNotFoundException;
import java.io.FileInputStream;

public class ThrowsException {
	public Class loadClass(String fileName, String ClassName) throws FileNotFoundException, ClassNotFoundException
	{
		FileInputStream fis= new FileInputStream(fileName);
		Class c= Class.forName(ClassName);
		return c;
	}
	
	
	
	public static void main(String[] args)
	{
		ThrowsException test= new ThrowsException();
		try {
			test.loadClass("a.txt", "java.lang.String");
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}


