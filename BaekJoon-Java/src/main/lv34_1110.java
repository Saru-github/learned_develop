package main;

import java.util.Scanner;

public class lv34_1110 {

	public static void main(String[] args) {

		
//		1110
//		
//		입력
//		첫째 줄에 N이 주어진다. N은 0보다 크거나 같고, 99보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 N의 사이클 길이를 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		
		
		
		int count = 0;
		int a = N;
		
		
		while (true) {
			N = ((N % 10) * 10) + (((N / 10) + (N % 10)) % 10);
			count++;
			
			if (a == N) {
				break;
				
			}
		}
		
		System.out.println(count);
	}

}
