package string;

public class StringTest2 {
	public static void main(String[] args)
	{
		String javaStr= new String("java"); //문자열1
		String andoridStr=new String("android"); //문자열2
		System.out.println(javaStr);
		System.out.println("처음 문자열 주소값: "+System.identityHashCode(javaStr)); //원본출력
		
		javaStr= javaStr.concat(andoridStr); //문자열 이어붙이기
		
		System.out.println(javaStr);
		System.out.println("연결된 문자열 주소값:" +System.identityHashCode(javaStr)); //결과 출력
		
		/*
		 이어붙인후 javaStr의 주소값이 변한다== 다른 문자열  String 생성 == 기존 주소에 덮어씌우는 개념이 아니다
		 */
	}
}
