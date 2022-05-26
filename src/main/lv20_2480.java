package main;

import java.util.Scanner;

public class lv20_2480 {

	public static void main(String[] args) {

//		2480
//		
//		입력
//		첫째 줄에 3개의 눈이 빈칸을 사이에 두고 각각 주어진다. 
//
//		출력
//		첫째 줄에 게임의 상금을 출력 한다.

		Scanner sc = new Scanner(System.in);
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		if (a == b && a == c && b == c) {
			System.out.print(10000 + (a * 1000));
		} else if (a == b || a == c) {
			System.out.print(1000 + (a * 100));
		} else if (b == c) {
			System.out.print(1000 + (b * 100));
		} else {
			System.out.print((Math.max(a, Math.max(b, c)) * 100));
		}
		
		sc.close();
	}

}
