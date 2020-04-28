package classpart;

public class PersonTest {

	public static void main(String[] args) {
		Person person1= new Person();
		person1.name="James";
		person1.age=40;
		person1.child=3;
		person1.married=true;
		
		System.out.println(person1.getage());
		System.out.println(person1.getname());
		System.out.println(person1.getmarried());
		System.out.println(person1.getchild());
		

	}

}
