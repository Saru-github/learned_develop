package main;

import java.util.Scanner;

public class lv41_4344 {

	public static void main(String[] args) {

//		4344
//		
//		입력
//		첫째 줄에는 테스트 케이스의 개수 C가 주어진다.
//
//		둘째 줄부터 각 테스트 케이스마다 학생의 수 N(1 ≤ N ≤ 1000, N은 정수)이 첫 수로 주어지고, 이어서 N명의 점수가 주어진다. 
//		점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//		출력
//		각 케이스마다 한 줄씩 평균을 넘는 학생들의 비율을 반올림하여 소수점 셋째 자리까지 출력한다.

		Scanner sc = new Scanner(System.in);

		int[] arr;

		int c = sc.nextInt();

		for (int i = 0; i < c; i++) {

			int N = sc.nextInt(); // 학생 수
			arr = new int[N];

			double sum = 0; // 성적 누적 합 변수

			// 성적 입력부분
			for (int j = 0; j < N; j++) {
				int score = sc.nextInt(); // 성적 입력
				arr[j] = score;
				sum += score; // 성적 누적 합
			}

			double dScore = (sum / N);
			double stu = 0; // 평균 넘는 학생 수 변수

			// 평균 넘는 학생 비율 찾기
			for (int j = 0; j < N; j++) {
				if (arr[j] > dScore) {
					stu++;
				}
			}

			System.out.printf("%.3f%%\n", (stu / N) * 100);

		}
		sc.close();

	}

}
