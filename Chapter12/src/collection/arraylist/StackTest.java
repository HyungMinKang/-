package collection.arraylist;

import java.util.ArrayList;

class MyStack
{
	private ArrayList<String> arrayStack=new ArrayList<String>();
	
	public void push(String data) //스택의 맨뒤(Top)에 요소추가
	{
		arrayStack.add(data);
	}
	
	public String pop() //스택의 top부터 데이터제거  LIFO 구조
	{
		int len=arrayStack.size();
		if(len==0) //스택이 비었다
		{
			System.out.println("Stack is empty");
			return null;
		}
		
		return arrayStack.remove(len-1);
	}
}
public class StackTest {
	public static void main(String[] args)
	{
		MyStack stack=new MyStack();
		
		stack.push("A");
		stack.push("B");
		stack.push("C");
		
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
	}
}
