package classpart;

public class OrdertTest {

	public static void main(String[] args) {
		Order order1= new Order();
		order1.ordernum=201803120001L;
		order1.orderID="abc123";
		order1.orderDate="2018�� 3�� 12��";
		order1.orderName="ȫ���";
		order1.orderedCode="PD0345-12";
		order1.orderAddress="����� �������� ���ǵ��� 20����";
		
		System.out.println("�ֹ���ȣ:"+order1.ordernum);
		System.out.println("�ֹ��� �ƾƵ�:"+order1.orderID);
		System.out.println("�ֹ� ��¥:"+order1.orderDate);
		System.out.println("�ֹ��� �̸�:"+order1.orderName);
		System.out.println("�ֹ� ��ǰ��ȣ:"+order1.orderedCode);
		System.out.println("���� �ּ�:"+order1.orderAddress);
		

	}

}
