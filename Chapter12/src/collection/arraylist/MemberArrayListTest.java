package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {
	public static void main(String[] args)
	{
		
		MemberArrayList memberArrayList= new MemberArrayList(); //����� ���� �迭����Ʈ ���� 
		Member memeberLee= new Member(1001,"������");
		Member memberSon= new Member(1002,"�չα�");
		Member memberPark= new Member(1003, "�ڼ���");
		Member memberHong= new Member(1004, "ȫ�浿");
		
		memberArrayList.addMember(memeberLee);
		memberArrayList.addMember(memberSon);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHong);
		
		memberArrayList.showAllMember();
		
		memberArrayList.removeMember(memberHong.getMemberId());
		memberArrayList.showAllMember();
		
		memberArrayList.insertMember(memberHong, 1);
		memberArrayList.showAllMember();
	}
	
}
