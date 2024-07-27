package exam01;

public class BasicInheritance {

	public static void main(String[] args) {

		Student student = new Student("이순신", "20010815", "서울시 종로구", "abc@email.com", "서울대", "경영학");
		BusinessMan bMan = new BusinessMan("홍길동", "19960915", "서울시 서대문구", "def@email.com", "IT회사", "영업부", "20210214");
		
		
		student.displayStudentInfo();
		System.out.println("=======================");
		bMan.displayBusinessManInfo();
		System.out.println("=======================");
		student.displayFriendInfo(); // 부모의 메소드도 자식이 사용가능
	}

}
