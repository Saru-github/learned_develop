package exam03;

public class ExitReturn {

	public static void main(String[] args) {

		divide(10, 2);
		divide(10, 3);

		divide(10, 0); // 분모가 0이면 나눌 수 없기 때문에 에러발생!

	}

	public static void divide(int num1, int num2) {
		int result = 0;
		
		if (num2 == 0) {
			System.out.println("나눌 수 없습니다.");
			return;		// 바로 복귀 메서드로 복귀. 
		}
		
		result = num1 / num2;
		System.out.println(num1 + " / " + num2 + " = " + result);
	}

}
