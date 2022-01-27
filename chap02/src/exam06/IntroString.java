package exam06;

public class IntroString {

	public static void main(String[] args) {
		
		// String 으로 메모리 할당시 int, char 등의 자료형보다 훨씬 큰 메모리 차지, 1글자는 char로 할당하여 메모리 낭비를 막을 수 있다.

		String hello = "안녕하세요?";
		String name = "홍길동";
		
		System.out.println(hello);
		System.out.println(name);
		
		name = "홍";
		System.out.println(name);
		
		name = "";
		System.out.println("이름: " +name);
		
		// Data type 에 따른 일반적인 초기화 방법
		
		int num1 = 0;
		double num2 = 0.0;
		char alphabet = ' ';
		boolean bool = false;
		String string1 = null; //"";
		
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(alphabet);
		System.out.println(bool);
		System.out.println(string1);
		
	
		
	}

}
