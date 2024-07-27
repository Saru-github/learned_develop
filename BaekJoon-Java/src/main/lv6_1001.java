package main;

import java.util.Scanner;

public class lv6_1001 {

	public static void main(String[] args) {
		
		
//		1001
		
//		입력
//		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		첫째 줄에 A-B를 출력한다.
		

		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = a-b;
		System.out.println(c);
		
		sc.close();
	}

}
