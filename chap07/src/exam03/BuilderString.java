package exam03;

public class BuilderString {

	public static void main(String[] args) {

//		StringBuilder str = new StringBuilder("Smart");
		
		StringBuffer str = new StringBuffer("Smart");
		
//		str.append(" and ");
//		str.append("Simple, ");
//		str.append(true);
//		str.append(25);
//		str.append(3.14);
		
		str.append(" and ").append("Simple, ").append(true).append(25).append(3.14); // 메서드 체이닝
		System.out.println(str);
		
		str.insert(22, false); // 0부터 시작, 공백도 카운팅
		
		System.out.println(str);
		
	}

}
