package string;

public class StringBuilderTest {
	public static void main(String[] args)
	{
		String javaStr= new String("Java");
		System.out.println("javaStr ���ڿ� �ּ�"+ System.identityHashCode(javaStr)); //�ʱ��ּҰ� ����
		
		StringBuilder buffer=new StringBuilder(javaStr); //String���� ���� StringBuilder ����  javaStr�� String���� StringBuilder�� ����
		System.out.println("������ buffer �޸��ּ�: "+ System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("������ buffer �޸��ּ�:"+System.identityHashCode(buffer));
		
		javaStr= buffer.toString(); //StringŬ������ �ٽú�ȯ
		System.out.println(javaStr);
		System.out.println("����� javaStr ���ڿ� �ּ�"+ System.identityHashCode(javaStr));
	}
}
