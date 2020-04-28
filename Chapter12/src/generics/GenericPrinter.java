package generics;

public class GenericPrinter<T> {
	
	private T material; //T자료형 선언 
	
	public void setMaterial(T material) //T자료형 매개변수 material
	{
		this.material=material;
	}
	
	public T getMaterial()  //T자료형 변수 material을 반환 
	{
		return material;
	}
	
	public String toString() //T자료형 매서드 호출
	{
		return material.toString();
	}
}
