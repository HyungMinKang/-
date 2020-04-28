package classex;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class PersonTest {

	public static void main(String[] args) throws ClassNotFoundException {
		Class pClass=Class.forName("classex.Person");
		Constructor[] cons= pClass.getConstructors();
		for(Constructor c: cons)
		{
			System.out.println(c);
		}
		System.out.println();
		
		Field[] fil= pClass.getFields();
		for(Field f:fil)
		{
			System.out.println(f);
			System.out.println(f.getName());
		}
		
		Method[] method= pClass.getMethods();
		for(Method m: method)
		{
			System.out.println(m);
		}
		

	}

}
