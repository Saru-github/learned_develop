package exam05;

public class SCE { // Short-Circuit Evaluation
	public static void main(String[] args) {

		int num1 = 0, num2 = 0;
		boolean result = false;

		result = ((num1 += 10) < 0) && ((num2 += 10) > 0);
		// (10 < 0) && (10 > 0) = false;
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("");
		
		// num2 = 0 인이유 -> && 연산시 앞항에서 false 값이 도출되면, 뒷항은 수행하지 않게된다.

		result = ((num1 += 10) > 0) || ((num2 += 10) < 0);
		// (20 > 0) || (10 < 0) = true;
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("");
		// num2 = 0 인이유 -> || 연산시 앞항에서 true 값이 도출되면, 뒷항은 수행하지 않게된다.

		
		// 만약 num2 가 계속 누적되게 하고싶다면? (미니과제)
		num1 += 10;
		num2 += 10;
		result = (num1 < 0) && (num2 > 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("");

		num1 += 10;
		num2 += 10;
		result = (num1 > 0) || (num2 < 0);
		System.out.println("결과 : " + result);
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);

	}

}
