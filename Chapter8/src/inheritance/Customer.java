package inheritance;

public class Customer {
	
	protected int customerID; //고객 아이디
	protected String customerName; //고객이름
	protected String customerGrade; //고객 등급
	int bonusPoint; //보너스포인트
	double bonusRatio; //적립 비율
	
	
	public Customer()
	{
		customerGrade="Silver";
		bonusRatio=0.01;
		System.out.println("Customer() 생성자 호출");
	}
	public Customer(int customerID, String customerName)
	{
		this.customerID=customerID;
		this.customerName=customerName;
		customerGrade="Silver";
		bonusRatio=0.01;
		System.out.println("Customer(int ,String) 생성자 호출");
	}
	
	public int calcPrice(int price)
	{
		bonusPoint+=price*bonusRatio; //보너스포인트 계산
		return price;
	}
	
	public String showCustomerInfo()
	{
		return customerName+ " 님의 등급은 "+ customerGrade+ "이며, 보너스 포인트는"+ bonusPoint+"입니다";
	}
	
	public int getCustomerID()
	{
		return customerID;
	}
	
	public void setCustomerID(int customerID)
	{
		this.customerID=customerID;
	}
	
	public String getCustomerName()
	{
		return customerName;
	}
	
	public void setCustomerName(String customerName)
	{
		this.customerName=customerName;
	}
	
	public String getCustomerGrade()
	{
		return customerGrade;
	}
	
	public void setCustomerGrade(String customerGrade)
	{
		this.customerGrade=customerGrade;
	}
	
}
