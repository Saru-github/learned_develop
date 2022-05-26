package main;

import java.util.Scanner;

public class lv29_2438 {

	public static void main(String[] args) {

		
//		2438
//		
//		문제
//		첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
//
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
		
		
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for(int i = 1; i <= N; i++) {
			for(int j = 0; j < i; j++) {
				
				System.out.print("*");
			
			}
			System.out.println();
		}
		
		
		
	}

}
