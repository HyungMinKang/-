package exercise;

public class Cong {
	
	int money;
	
	public String brewing(int money)
	{
		this.money+=money;
		if(money==Menu.CONGAMERICANO)
		{
			return "��ī�� �Ƹ޸�ī�븦 �����߽��ϴ�";
		}
		else if(money==Menu.CONGLATTE)
		{
			return "��ī�� ���׸� �����߽��ϴ�";
		}
		else
		{
			return null;
		}
	}

}
