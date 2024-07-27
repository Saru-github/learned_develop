package main;

import java.util.Scanner;

public class lv8_1008 {

	public static void main(String[] args) {
		
		
//		1008
		
//		입력
//		첫째 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		첫째 줄에 A/B를 출력한다. 실제 정답과 출력값의 절대오차 또는 상대오차가 10-9 이하이면 정답이다.

		
		
		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		
		System.out.println((double)a/(double)b);
		
		sc.close();
	}

}
