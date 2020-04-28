package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	
	private ArrayList<Member> arrayList;
	
	public MemberArrayList()
	{
		arrayList= new ArrayList<Member>();
	}
	
	public void addMember(Member member)
	{
		arrayList.add(member);
	}
	
	public boolean removeMember(int memberId)
	{
		for(int i=0; i< arrayList.size();i++)
		{
			Member member= arrayList.get(i);
			int tempId= member.getMemberId();
			if(tempId==memberId)
			{
				arrayList.remove(i);
				return true;
			}
		}
		System.out.println(memberId+ "가 존재하지 않습니다");
		return false;
	}
	
	public void showAllMember()
	{
		for(Member member: arrayList)
		{
			System.out.println(member);
		}
		System.out.println();
	}
	
	public void insertMember(Member member, int position) { 
		if(position <0 || position > arrayList.size()+1) { //배열의 범위 넘어감
			System.out.println("지정 된 자리에 추가할 수 없습니다");
			return;
		}
		arrayList.add(position-1, member); //배열의 index는 0부터 시작 => -1 이유
	}
}
