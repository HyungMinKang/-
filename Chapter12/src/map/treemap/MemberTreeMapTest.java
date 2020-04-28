package map.treemap;

import collection.Member;
public class MemberTreeMapTest {
	public static void main(String[] args)
	{
		MemberTreeMap memberHashMap= new MemberTreeMap();
		
		Member memberLee= new Member(1001,"ÀÌÁö¿ø");
		Member memberSon= new Member(1002, "¼Õ¹Î±¹");
		Member memberPark= new Member(1003,"¹Ú¼­ÈØ");
		Member memberHong= new Member(1004,"È«±æµ¿");
		
		memberHashMap.addMember(memberLee);
		memberHashMap.addMember(memberSon);
		memberHashMap.addMember(memberPark);
		memberHashMap.addMember(memberHong);
		
		memberHashMap.showAllMember();
		memberHashMap.removeMember(1004);
		memberHashMap.showAllMember();
	}
}
