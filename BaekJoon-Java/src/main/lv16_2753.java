package main;

import java.util.Scanner;

public class lv16_2753 {

	public static void main(String[] args) {

		
//		2753
//		
//		입력
//		첫째 줄에 연도가 주어진다. 연도는 1보다 크거나 같고, 4000보다 작거나 같은 자연수이다.
//
//		출력
//		첫째 줄에 윤년이면 1, 아니면 0을 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		int year = sc.nextInt();
		if(year % 4 == 0 && (year % 100 != 0||year%400==0)) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		sc.close();
		
	}

}
