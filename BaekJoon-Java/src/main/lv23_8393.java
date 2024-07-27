package main;

import java.util.Scanner;

public class lv23_8393 {

	public static void main(String[] args) {

		
//		8393
//		
//		입력
//		첫째 줄에 n (1 ≤ n ≤ 10,000)이 주어진다.
//
//		출력
//		1부터 n까지 합을 출력한다.
		
		int sum = 0;
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		for(int i = 0; i <= n; i++) {
			sum += i;
		}
		System.out.println(sum);
		
	}

}
