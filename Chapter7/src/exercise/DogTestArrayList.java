package exercise;

import java.util.ArrayList;
public class DogTestArrayList {

	public static void main(String[] args) {
		
		ArrayList<Dog> doglist= new ArrayList<Dog>();
		
		doglist.add(new Dog("�۸���","ġ�Ϳ�"));
		doglist.add(new Dog("������","��Ƽ��"));
		doglist.add(new Dog("�ǻ�","������"));
		doglist.add(new Dog("�̸�","�����ڱ�"));
		doglist.add(new Dog("���","Ǫ��"));
		
		for(int i=0;i<doglist.size();i++)
		{
			Dog dog= doglist.get(i);
			System.out.println(dog.showDogInfo());
		}
		
				
	}

}
