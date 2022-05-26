package main;

import java.util.Scanner;

public class lv17_14681 {

	public static void main(String[] args) {

		
//		14681
//		
//		입력
//		첫 줄에는 정수 x가 주어진다. (−1000 ≤ x ≤ 1000; x ≠ 0) 다음 줄에는 정수 y가 주어진다. (−1000 ≤ y ≤ 1000; y ≠ 0)
//
//		출력
//		점 (x, y)의 사분면 번호(1, 2, 3, 4 중 하나)를 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		if(x > 0) {
			if(y>0) {
				System.out.println("1");
			} else {
				System.out.println("4");
			}
		} else {
			if (y<0) {
				System.out.println("3");
			} else {
				System.out.println("2");
			}
		}
		
		sc.close();
		
		
	}

}
