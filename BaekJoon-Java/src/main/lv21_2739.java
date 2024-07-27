package main;

import java.util.Scanner;

public class lv21_2739 {

	public static void main(String[] args) {

//		2739
//		
//		입력
//		첫째 줄에 N이 주어진다. N은 1보다 크거나 같고, 9보다 작거나 같다.
//
//		출력
//		출력형식과 같게 N*1부터 N*9까지 출력한다.

		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		for (int i = 1; i <= 9; i++) {
			System.out.println(N + " * " + i + " = " + N * i);

		}
		sc.close();

	}

}
