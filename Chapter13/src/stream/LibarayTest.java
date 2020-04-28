package stream;

import java.util.List;
import java.util.ArrayList;

class Book{
	
	private String name;
	private int price;
	
	public Book(String name, int price)
	{
		this.name=name;
		this.price=price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	
}

public class LibarayTest {

	public static void main(String[] args) {
		List<Book> bookList= new ArrayList<>();
		bookList.add(new Book("�ڹ�",25000));
		bookList.add(new Book("���̽�",15000));
		bookList.add(new Book("�ȵ���̵�",30000));
		
		int total= bookList.stream().mapToInt(c->c.getPrice()).sum();
		System.out.println("��� å�� ���� "+ total+ "�� �Դϴ�");
		
		bookList.stream().filter(c->c.getPrice()>=20000).map(c->c.getName()).sorted().forEach(s->System.out.println(s));
	}

}
