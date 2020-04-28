package exercise;

public class Person {
	
	public String personName;
	public int money;
	
	
	public Person(String personName, int money)
	{
		this.personName=personName;
		this.money=money;
	}
	
	public void buyStarCoffee(Star starcoffe, int money)
	{
		String message= starcoffe.brewing(money);
		if(message!=null)
		{
			this.money-=money;
			System.out.println(personName+"¥‘¿Ã"+money+"∑Œ"+message);
		}
				
		
	}
	public void buyCongCoffee(Cong congcoffee, int money)
	{
		String message= congcoffee.brewing(money);
		if(message!=null)
		{
			this.money-=money;
			System.out.println(personName+"¥‘¿Ã"+money+"∑Œ"+message);
			
		}
	}
	
}
