package exception;

public class PassWordFormatTest {
	
	private String password;
	
	public String getPass()
	{
		return password;
	}
	
	public void setPass(String pass) throws PassWordFormatException
	{
		
		if(pass==null)
		{
			throw new PassWordFormatException("비밀번호는 null일 수 없습니다");
		}
		
		else if(pass.length()<=5)
		{
			throw new  PassWordFormatException("비밀번호는 5자이하일수 없습니다");
		}
		
		else if(pass.matches("[a-zA-Z]+"));
		{
			throw new PassWordFormatException("비밀번호는 문자열로만 구성될 수 없습니다");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		PassWordFormatTest test=new PassWordFormatTest();
		
		String pass=null;
		try
		{	
			test.setPass(pass);
			System.out.println("오류 없음1");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="ab123";
		try
		{
			test.setPass(pass);
			System.out.println("오류 없음2");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="abcdef";
		try
		{
			test.setPass(pass);
			System.out.println("오류 없음3");
			
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="abcde1";
		try
		{
			test.setPass(pass);
			System.out.println("오류 없음4");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
				
	}

}
