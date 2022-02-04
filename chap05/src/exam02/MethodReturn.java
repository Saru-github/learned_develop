package exam02;

public class MethodReturn {
	
	public static void main(String[] args) {
		
		int result = multify(100, 20); // 지역변수 재사용가능 , (동시에 실행 될 일이 없을 때)

		if (result >= 1000) {
			System.out.println("1000 이상 이군요.");
		}

	}

	public static int multify(int n1, int n2) { // int n1, int n2 - 파라미터
		
		int result = 0;  // 지역변수, +매개 변수(파라미터)는 호출 시점에 할당되고, 메서드 수행이 끝나면 (영역을 벗어나면) 자동소멸.

		result = n1 * n2;
		System.out.println("곱셈의 값: " + result);
		return result;

	}

}
