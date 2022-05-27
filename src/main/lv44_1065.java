package main;

import java.util.Scanner;

public class lv44_1065 {

	public static void main(String[] args) {

//		1065
//		
//		입력
//		첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.
//
//		출력
//		첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다.
		
		

		Scanner in = new Scanner(System.in);

		System.out.print(arithmetic_sequence(in.nextInt()));
		in.close();

	}

	public static int arithmetic_sequence(int num) {
		int cnt = 0; // 한수 카운팅

		if (num < 100) {
			return num;
		}

		else {
			cnt = 99;

			for (int i = 100; i <= num; i++) {
				int hun = i / 100; // 백의 자릿수
				int ten = (i / 10) % 10; // 십의 자릿수
				int one = i % 10;

				if ((hun - ten) == (ten - one)) { // 각 자릿수가 수열을 이루면
					cnt++;
				}
			}
		}

		return cnt;
	}

}