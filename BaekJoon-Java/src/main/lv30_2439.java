package main;

import java.util.Scanner;

public class lv30_2439 {

	public static void main(String[] args) {

//		2439
//		
//		입력
//		첫째 줄에 N(1 ≤ N ≤ 100)이 주어진다.
//
//		출력
//		첫째 줄부터 N번째 줄까지 차례대로 별을 출력한다.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();

		for (int i = 1; i <= N; i++) {
			for (int j = 0; j < N - i; j++) {
				System.out.print(" ");
			}
			for (int k = 1; k <= i; k++) {
				System.out.print("*");
			}
			System.out.print("\n");
		}

		sc.close();

	}

}
