package string;

public class StringBuilderTest {
	public static void main(String[] args)
	{
		String javaStr= new String("Java");
		System.out.println("javaStr 문자열 주소"+ System.identityHashCode(javaStr)); //초기주소값 설정
		
		StringBuilder buffer=new StringBuilder(javaStr); //String으로 부터 StringBuilder 생성  javaStr을 String에서 StringBuilder로 변경
		System.out.println("연산전 buffer 메모리주소: "+ System.identityHashCode(buffer));
		
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!!");
		System.out.println("연산후 buffer 메모리주소:"+System.identityHashCode(buffer));
		
		javaStr= buffer.toString(); //String클래스로 다시변환
		System.out.println(javaStr);
		System.out.println("연결된 javaStr 문자열 주소"+ System.identityHashCode(javaStr));
	}
}
