package classex;

public class ClassTest {
	
	public static void mian(String[] args) throws ClassNotFoundException
	{
		Person person=new Person();
		Class<? extends Person> pClass1=person.getClass(); //Object의 getClass()의 메소드 사용
		System.out.println(pClass1.getName());
		
		Class<Person> pClass2= Person.class; //직접 클래스파일 대입
		System.out.println(pClass2.getName()); 
		
		Class<?> pClass3= Class.forName("classex.Person"); //클래시 이름으로 가져오기
		System.out.println(pClass3.getName());
	}
}
