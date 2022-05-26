package main;

import java.util.Arrays;
import java.util.Scanner;

public class lv35_10818 {

	public static void main(String[] args) {

		
//		10818
//		
//		입력
//		첫째 줄에 정수의 개수 N (1 ≤ N ≤ 1,000,000)이 주어진다. 둘째 줄에는 N개의 정수를 공백으로 구분해서 주어진다. 모든 정수는 -1,000,000보다 크거나 같고, 1,000,000보다 작거나 같은 정수이다.
//
//		출력
//		첫째 줄에 주어진 정수 N개의 최솟값과 최댓값을 공백으로 구분해 출력한다.
		
		Scanner sc = new Scanner(System.in);
        
		int N = sc.nextInt();
		int[] arr = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = sc.nextInt();
		}
        
		Arrays.sort(arr);
		System.out.print(arr[0] + " " + arr[N - 1]);
		sc.close();
	}
}
