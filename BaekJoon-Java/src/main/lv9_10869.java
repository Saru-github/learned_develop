package main;

import java.util.Scanner;

public class lv9_10869 {

	public static void main(String[] args) {
		
		
		
//		10869
		
//		입력
//		두 자연수 A와 B가 주어진다. (1 ≤ A, B ≤ 10,000)
//
//		출력
//		첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B를 출력한다.
		
		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println(a+b);
		System.out.println(a-b);
		System.out.println(a*b);
		System.out.println(a/b);
		System.out.println(a%b);
		
		sc.close();
	}

}
	