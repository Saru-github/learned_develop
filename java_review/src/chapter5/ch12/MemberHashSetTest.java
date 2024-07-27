package chapter5.ch12;

public class MemberHashSetTest {

	public static void main(String[] args) {
		
		MemberHashSet memberHashSet = new MemberHashSet();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberPark = new Member(1003, "박혁거세");
		Member memberHeo = new Member(1004, "허준");
		Member memberKoo = new Member(1005, "구준표");

		
		memberHashSet.addMember(memberLee);
		memberHashSet.addMember(memberKim);
		memberHashSet.addMember(memberKoo);
		memberHashSet.addMember(memberPark);
		memberHashSet.addMember(memberHeo);
		
		memberHashSet.showAllMember();
		memberHashSet.removeMember(memberHeo.getMemberId());
		memberHashSet.showAllMember();
	}

}
