package main;

import java.util.Scanner;

public class lv22_10950 {

	public static void main(String[] args) {

		
//		10950
//		
//		입력
//		첫째 줄에 테스트 케이스의 개수 T가 주어진다.
//
//		각 테스트 케이스는 한 줄로 이루어져 있으며, 각 줄에 A와 B가 주어진다. (0 < A, B < 10)
//
//		출력
//		각 테스트 케이스마다 A+B를 출력한다.
		
		
		
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		int arr[] = new int[T];
		for(int i = 0; i < T; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			arr[i] = A+B;
		}
		
		sc.close();
		
		for(int i : arr) {
			System.out.println(i);
		}
		
	}

}
