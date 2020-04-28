package exercise2;

public class CardTest {

	public static void main(String[] args) {
		CardCompany company = CardCompany.getInstance();  //싱글톤 패턴
		
		Card myCard = company.createCard();   //메서드에서 Car 생성
		Card yourCard = company.createCard();
		
		System.out.println(myCard.getCardNumber());    //10001  출력
		System.out.println(yourCard.getCardNumber());

	}

}
