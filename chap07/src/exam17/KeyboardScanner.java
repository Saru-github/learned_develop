package exam17;

import java.util.Scanner;

public class KeyboardScanner {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("덧셈 연산 수행 프로그램");
		
		System.out.print("첫번째 정수값 입력: ");
		int a = sc.nextInt();
		System.out.print("두번째 정수값 입력: ");
		int b = sc.nextInt();
		
		// System.out.printf("%d, %d\n",a, b);
		int sum = a + b;
		System.out.printf("%d + %d = %d\n",a, b, sum);
		
		sc.nextLine(); // dummy code
		
		System.out.println("당신의 이름은?");
		String name = sc.nextLine();
		
		System.out.printf("당신의 이름은 %s 입니다", name);
	}

}
