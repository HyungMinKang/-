package exercise;

public class Coffetest {

	public static void main(String[] args) {
		Person personkim=new Person("±è¾¾",10000);
		Person personlee=new Person("ÀÌ¾¾",12000);
		
		Star starcoffee=new Star();
		Cong congcofffe=new Cong();
		
		personkim.buyStarCoffee(starcoffee, 4000);
		personlee.buyCongCoffee(congcofffe, 4200);
		

	}

}
