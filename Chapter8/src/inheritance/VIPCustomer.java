package inheritance;

public class VIPCustomer extends Customer{

	private int agentID;
	double saleRatio;
	
	public VIPCustomer()
	{
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		
		System.out.println("VIPCustomer() 생성자 호출");
	}
	
	public VIPCustomer(int customerID, String customerName,int agentID)
	{	
		super(customerID, customerName);  //상위 클래스의 생성자 호출
		customerGrade="VIP";
		bonusRatio=0.05;
		saleRatio=0.1;
		this.agentID=agentID;
		System.out.println("VIPCustomer(int,String) 생성자 호출");
	}
	
	
	@Override
	public int calcPrice(int price)
	{
		bonusPoint+=price*bonusRatio;
		return price-(int)(price*saleRatio);
	}


	public int getAgentID()
	{
		return agentID;
	}
	
}
