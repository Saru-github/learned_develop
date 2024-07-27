package main;

import java.util.Scanner;

public class lv36_2562 {

	public static void main(String[] args) {

//		2562
//		
//		입력
//		첫째 줄부터 아홉 번째 줄까지 한 줄에 하나의 자연수가 주어진다. 주어지는 자연수는 100 보다 작다.
//
//		출력
//		첫째 줄에 최댓값을 출력하고, 둘째 줄에 최댓값이 몇 번째 수인지를 출력한다.

		int max = 0;
		int index = 0;
		Scanner sc = new Scanner(System.in);

		int arr[] = new int[9];

		for (int i = 0; i < 9; i++) {

			int a = sc.nextInt();
			arr[i] = a;
			if (a > max) {
				max = arr[i];
				index = i + 1;
			}
		}

		System.out.println(max);
		System.out.println(index);

	}

}
