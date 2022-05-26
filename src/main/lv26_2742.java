package main;

import java.util.Scanner;

public class lv26_2742 {

	public static void main(String[] args) {

//		2742
//		
//		입력
//		첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.
//
//		출력
//		첫째 줄부터 N번째 줄 까지 차례대로 출력한다.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int a = N;
		for (int i = 1; i <= N; i++) {
			System.out.println(a);
			a--;
		}

	}

}
