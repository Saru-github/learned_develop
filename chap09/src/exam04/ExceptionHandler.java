package exam04;

import java.util.Scanner;

public class ExceptionHandler {

	public static void main(String[] args) {

		Scanner keyboard = new Scanner(System.in);
		int[] arr = new int[10];
		
		try {
			System.out.print("나누어지는 수(정수) 입력: ");
			int num1 = keyboard.nextInt();
			
			System.out.print("나누는 수(정수) 입력: ");
			int num2 = keyboard.nextInt();
			
			System.out.print("연산 결과를 저장할 배열의 인덱스 입력: ");
			int index = keyboard.nextInt();
			
			arr[index] = num1 / num2;
			
			System.out.println(arr[index]);
			
		} catch (ArithmeticException e) {
			System.out.println("나눗셈 불가능...");
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열의 인덱스 범위를 벗어남...");
			System.out.println(e.getMessage());
		}
		
		System.out.println("프로그램 종료...");
		
	}

}
