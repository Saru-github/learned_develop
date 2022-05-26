package main;

import java.util.Scanner;

public class lv25_2741 {

	public static void main(String[] args) {

//		2741
//		
//		문제
//		자연수 N이 주어졌을 때, 1부터 N까지 한 줄에 하나씩 출력하는 프로그램을 작성하시오.
//
//		입력
//		첫째 줄에 100,000보다 작거나 같은 자연수 N이 주어진다.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= N; i++) {
			System.out.println(i);
		}

	}

}
