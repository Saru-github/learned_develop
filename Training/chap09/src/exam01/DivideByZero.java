package exam01;

import java.util.Scanner;

public class DivideByZero {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("나누어지는 수(정수) 입력: ");
		int num1 = input.nextInt();
		System.out.print("나누는 수(정수) 입력: ");
		int num2 = input.nextInt();
		
		if(num2 == 0) { // 에러 발생 여부 체크.
			System.out.println("나눗셈 불가...");
		} else {
			System.out.println(num1 / num2);
		}
		
		
		System.out.println("프로그램 종료.");
		
		
	}

}
