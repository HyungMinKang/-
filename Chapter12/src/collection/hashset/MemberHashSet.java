package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; //hashSet 선언  - private= 생성자 필요
	
	public MemberHashSet()
	{
		hashSet= new HashSet<Member>();
	}
	
	public void addMember(Member member)
	{
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) //set자료구조는 순서없음 따라서 for문으로 멤버찾기 불가 => Iterator 이용
 	{
		Iterator<Member> ir=hashSet.iterator(); 
		
		while(ir.hasNext()) //haSet내에 요소가 존재하는한 반복
		{
			Member member= ir.next(); //회원을 하나씩 가져옴
			int tempId= member.getMemberId(); 
			if(tempId==memberId) //삭제요청아이디가 set내에 존재한다면
			{
				hashSet.remove(member); //삭제
				return true;
			}
		}
		System.out.println(memberId+ "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMemeber()
	{
		for(Member member: hashSet)
		{
			System.out.println(member);
		}
		System.out.println();
	}
}
