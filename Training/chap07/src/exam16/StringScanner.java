package exam16;

// import java.lang.String; // 자주쓰이는 lang 같은 경우는 생략 할 수 있게 해두었다.
// import java.lang.System;
// import java.lang.*;		// * -> lang 아래의 모든 기능 사용

import java.util.Scanner;

public class StringScanner {

	public static void main(String[] args) {

		String source = "1 5 7";
		Scanner scanner = new Scanner(source);
		
		int num1 = scanner.nextInt();
		int num2 = scanner.nextInt();
		int num3 = scanner.nextInt();
		int sum = num1 + num2 + num3;
		
		System.out.printf("문자열에 저장된 num1 = %d, num2 = %d, num3 = %d, sum = %d\n", num1, num2, num3, sum);
		
	}

}
