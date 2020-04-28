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
			throw new PassWordFormatException("��й�ȣ�� null�� �� �����ϴ�");
		}
		
		else if(pass.length()<=5)
		{
			throw new  PassWordFormatException("��й�ȣ�� 5�������ϼ� �����ϴ�");
		}
		
		else if(pass.matches("[a-zA-Z]+"));
		{
			throw new PassWordFormatException("��й�ȣ�� ���ڿ��θ� ������ �� �����ϴ�");
		}
		
		
		
		
	}

	public static void main(String[] args) {
		
		PassWordFormatTest test=new PassWordFormatTest();
		
		String pass=null;
		try
		{	
			test.setPass(pass);
			System.out.println("���� ����1");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="ab123";
		try
		{
			test.setPass(pass);
			System.out.println("���� ����2");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="abcdef";
		try
		{
			test.setPass(pass);
			System.out.println("���� ����3");
			
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
		
		pass="abcde1";
		try
		{
			test.setPass(pass);
			System.out.println("���� ����4");
		}catch(PassWordFormatException e)
		{
			System.out.println(e.getMessage());
		}
				
	}

}
