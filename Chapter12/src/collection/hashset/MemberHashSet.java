package collection.hashset;

import java.util.HashSet;
import java.util.Iterator;
import collection.Member;

public class MemberHashSet {
	private HashSet<Member> hashSet; //hashSet ����  - private= ������ �ʿ�
	
	public MemberHashSet()
	{
		hashSet= new HashSet<Member>();
	}
	
	public void addMember(Member member)
	{
		hashSet.add(member);
	}
	
	public boolean removeMember(int memberId) //set�ڷᱸ���� �������� ���� for������ ���ã�� �Ұ� => Iterator �̿�
 	{
		Iterator<Member> ir=hashSet.iterator(); 
		
		while(ir.hasNext()) //haSet���� ��Ұ� �����ϴ��� �ݺ�
		{
			Member member= ir.next(); //ȸ���� �ϳ��� ������
			int tempId= member.getMemberId(); 
			if(tempId==memberId) //������û���̵� set���� �����Ѵٸ�
			{
				hashSet.remove(member); //����
				return true;
			}
		}
		System.out.println(memberId+ "�� �������� �ʽ��ϴ�");
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
