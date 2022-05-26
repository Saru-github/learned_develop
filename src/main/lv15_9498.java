package main;

import java.util.Scanner;

public class lv15_9498 {

	public static void main(String[] args) {

		
//		9498
//		
//		입력
//		첫째 줄에 시험 점수가 주어진다. 시험 점수는 0보다 크거나 같고, 100보다 작거나 같은 정수이다.
//
//		출력
//		시험 성적을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int score = sc.nextInt();
		
		if(score<=100 && score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		sc.close();
		
	}

}
