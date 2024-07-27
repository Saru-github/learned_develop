package main;

import java.util.Scanner;

public class lv13_2588 {

	public static void main(String[] args) {
		
		
//		2588
//		
//		입력
//		첫째 줄에 (1)의 위치에 들어갈 세 자리 자연수가, 둘째 줄에 (2)의 위치에 들어갈 세자리 자연수가 주어진다.
//
//		출력
//		첫째 줄부터 넷째 줄까지 차례대로 (3), (4), (5), (6)에 들어갈 값을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		int A = sc.nextInt();
		int B = sc.nextInt();
		int a = (B % 10);		// 일의자리
		int b = (B % 100 / 10);	// 십의자리
		int c = (B / 100); 		// 백의자리
		
		System.out.println(A*a);
		System.out.println(A*b);
		System.out.println(A*c);
		System.out.println(A*B);
		
		sc.close();

	}

}
