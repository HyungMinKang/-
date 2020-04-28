package loopexample;

public class operator_switch {

	public static void main(String[] args) {
		int num1=10;
		int num2=2;
		int result=0;
		char operator='+';
		
		switch(operator)
		{
		case '+':
			result=num1+num2;
			break;
		case '-':
			result=num1-num2;
			break;
		case '*':
			result=num1*num2;
			break;
		case '/':
			result=num1/num2;
			break;
		default:
			System.out.println("연산자 입력오류"+"재입력");
			
			
		}
		System.out.println("연산결과 reuslt: "+result);

	}

}
