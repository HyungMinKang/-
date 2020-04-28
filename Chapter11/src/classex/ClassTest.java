package classex;

public class ClassTest {
	
	public static void mian(String[] args) throws ClassNotFoundException
	{
		Person person=new Person();
		Class<? extends Person> pClass1=person.getClass(); //Object�� getClass()�� �޼ҵ� ���
		System.out.println(pClass1.getName());
		
		Class<Person> pClass2= Person.class; //���� Ŭ�������� ����
		System.out.println(pClass2.getName()); 
		
		Class<?> pClass3= Class.forName("classex.Person"); //Ŭ���� �̸����� ��������
		System.out.println(pClass3.getName());
	}
}
