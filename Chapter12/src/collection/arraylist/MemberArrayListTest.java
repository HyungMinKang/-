package collection.arraylist;

import collection.Member;
public class MemberArrayListTest {
	public static void main(String[] args)
	{
		
		MemberArrayList memberArrayList= new MemberArrayList(); //멤버를 담을 배열리스트 생성 
		Member memeberLee= new Member(1001,"이지원");
		Member memberSon= new Member(1002,"손민국");
		Member memberPark= new Member(1003, "박서훤");
		Member memberHong= new Member(1004, "홍길동");
		
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
