package exercise;

public class Dog {
	
	private String name;
	private String type;
	public String getName()
	{
		return name;
	}
	
	public Dog(String name, String type)
	{
		this.name=name;
		this.type=type;
	}
	public void setName(String name)
	{
		this.name=name;
	}
	
	public String gettype()
	{
		return type;
	}
	
	public void setType(String type)
	{
		this.type=type;
	}
	
	public String showDogInfo()
	{
		return name +","+ type;
	}
}
