package string;

public class StringTest2 {
	public static void main(String[] args)
	{
		String javaStr= new String("java"); //���ڿ�1
		String andoridStr=new String("android"); //���ڿ�2
		System.out.println(javaStr);
		System.out.println("ó�� ���ڿ� �ּҰ�: "+System.identityHashCode(javaStr)); //�������
		
		javaStr= javaStr.concat(andoridStr); //���ڿ� �̾���̱�
		
		System.out.println(javaStr);
		System.out.println("����� ���ڿ� �ּҰ�:" +System.identityHashCode(javaStr)); //��� ���
		
		/*
		 �̾������ javaStr�� �ּҰ��� ���Ѵ�== �ٸ� ���ڿ�  String ���� == ���� �ּҿ� ������ ������ �ƴϴ�
		 */
	}
}
