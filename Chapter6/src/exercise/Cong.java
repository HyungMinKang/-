package exercise;

public class Cong {
	
	int money;
	
	public String brewing(int money)
	{
		this.money+=money;
		if(money==Menu.CONGAMERICANO)
		{
			return "콩카페 아메리카노를 구입했습니다";
		}
		else if(money==Menu.CONGLATTE)
		{
			return "콩카페 라테를 구입했습니다";
		}
		else
		{
			return null;
		}
	}

}
