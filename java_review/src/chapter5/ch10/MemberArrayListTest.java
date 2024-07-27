package chapter5.ch10;

public class MemberArrayListTest {

	public static void main(String[] args) {
		
		MemberArrayList memberArrayList = new MemberArrayList();
		
		Member memberLee = new Member(1001, "이순신");
		Member memberKim = new Member(1002, "김유신");
		Member memberPark = new Member(1003, "박혁거세");
		Member memberHeo = new Member(1004, "허준");
		Member memberKoo = new Member(1005, "구준표");

		
		memberArrayList.addMember(memberLee);
		memberArrayList.addMember(memberKim);
		memberArrayList.addMember(memberKoo);
		memberArrayList.addMember(memberPark);
		memberArrayList.addMember(memberHeo);
		
		memberArrayList.showAllMember();
		memberArrayList.removeMember(memberHeo.getMemberId());
		memberArrayList.showAllMember();
	}

}
