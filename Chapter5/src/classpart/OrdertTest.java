package classpart;

public class OrdertTest {

	public static void main(String[] args) {
		Order order1= new Order();
		order1.ordernum=201803120001L;
		order1.orderID="abc123";
		order1.orderDate="2018년 3월 12일";
		order1.orderName="홍길순";
		order1.orderedCode="PD0345-12";
		order1.orderAddress="서울시 영등포구 여의도동 20번지";
		
		System.out.println("주문번호:"+order1.ordernum);
		System.out.println("주문자 아아디:"+order1.orderID);
		System.out.println("주문 날짜:"+order1.orderDate);
		System.out.println("주문자 이름:"+order1.orderName);
		System.out.println("주문 상품번호:"+order1.orderedCode);
		System.out.println("배종 주소:"+order1.orderAddress);
		

	}

}
