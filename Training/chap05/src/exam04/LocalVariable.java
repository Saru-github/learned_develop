package exam04;

public class LocalVariable {

	public static void main(String[] args) {

		boolean scope = true;
		//double result = 0.0;			// 같은 범위 내 사용 중
		//double num = 3.14;			// 하위 범위에도 영향을 줌.
		
		int result = simple(5);
		System.out.println(result);
		
		if(scope) {
			int num = 5;
			num++;
			System.out.println(num);
		} else {
			int num = -5;
			num++;
			System.out.println(num);
			
		}

	}

	public static int simple(int num) {

		int result = num * num;

		System.out.println("전달된 값: " + num);
		System.out.println("결과 값: " + result);

		return result;

	}

}