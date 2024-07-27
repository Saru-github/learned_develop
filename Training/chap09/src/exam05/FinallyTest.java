package exam05;

public class FinallyTest {

	public static void main(String[] args) {
		
		boolean divOK = divider(4, 2);

		if(divOK) {
			System.out.println("연산 성공.");
		} else {
			System.out.println("연산 실패.");
		}
		divOK = divider(4, 0);
		
		if(divOK) {
			System.out.println("연산 성공.");
		} else {
			System.out.println("연산 실패.");
		}
	}
	
	
	public static boolean divider(int n1, int n2) {
		
		try {
			int result = n1 / n2;
			return true;
		} catch (ArithmeticException e) {
			System.out.println("나눗셈 불가능...");
			return false;
		} finally { // 예외가 발생하든, 안하든 finally 구문을 실행 후 try - catch 문을 벗어남. (return 을 만난다 하더라도)
			System.out.println("finally 실행.");
		}
	}

}
