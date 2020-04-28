package generics;

public class GenericPrinter<T> {
	
	private T material; //T�ڷ��� ���� 
	
	public void setMaterial(T material) //T�ڷ��� �Ű����� material
	{
		this.material=material;
	}
	
	public T getMaterial()  //T�ڷ��� ���� material�� ��ȯ 
	{
		return material;
	}
	
	public String toString() //T�ڷ��� �ż��� ȣ��
	{
		return material.toString();
	}
}
