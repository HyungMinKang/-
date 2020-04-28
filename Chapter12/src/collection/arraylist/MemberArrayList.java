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
		System.out.println(memberId+ "�� �������� �ʽ��ϴ�");
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
		if(position <0 || position > arrayList.size()+1) { //�迭�� ���� �Ѿ
			System.out.println("���� �� �ڸ��� �߰��� �� �����ϴ�");
			return;
		}
		arrayList.add(position-1, member); //�迭�� index�� 0���� ���� => -1 ����
	}
}
