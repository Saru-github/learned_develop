package exam02;

public class Comment {

	public static void main(String[] args) {
		
		// '//' 을 이용해서 주석 처리 가능
		// '/**/' 을 이용해서 구간 범위 주석 처리 가능 

		System.out.println("Hello Java!"); // 문자열 출력

		System.out.println(100); // 정수 출력
		System.out.println(3.14); // 실수 출력

		
		// 사칙연산
		System.out.println(100 + 15);
		System.out.println(100 - 15);
		System.out.println(100 * 15);
		System.out.println(100 / 15);
		
		// 문자열 + 문자열
		System.out.println("Hello" + "Java!");
		
		
		System.out.println("100" + 100); 
		// System.out.println("100" + "100"); ,문자와 정수끼리  -, *, /,  등의 사칙연산 불가

	}

}