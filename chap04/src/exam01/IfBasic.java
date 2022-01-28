package exam01;

public class IfBasic {

	public static void main(String[] args) {

		int num1 = 47; // 변수 선언 및 초기화
		int num2 = 38;
		int result = 0;

		result = (num1 * num1 * num2 * num2) / (num1 - num2);

		if (result >= 50000) {  // if(354421 > 50000) -> if(true) 
			System.out.println("실행 결과 값이 50000이상 입니다.");
			System.out.println(result);
		} 
		
		System.out.println("프로그램 종료...");
		
	
	}

	

}
