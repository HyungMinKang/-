package exercise;

import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> doglist= new ArrayList<Dog>();
		
		doglist.add(new Dog("¸Û¸ÛÀÌ","Ä¡¿Í¿Í"));
		doglist.add(new Dog("¼ø½ÉÀÌ","¸»Æ¼Áî"));
		doglist.add(new Dog("»Ç»ß","Áøµ¾°³"));
		doglist.add(new Dog("¹Ì¸£","À£½ÃÄÚ±â"));
		doglist.add(new Dog("³ë·ç","Çªµé"));
		
		for(int i=0;i<doglist.size();i++)
		{
			Dog dog= doglist.get(i);
			System.out.println(dog.showDogInfo());
		}
		
				
	}

}
