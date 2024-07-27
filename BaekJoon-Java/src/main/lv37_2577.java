package main;

import java.util.Scanner;

public class lv37_2577 {

	public static void main(String[] args) {

		
//		2577
//		
//		입력
//		첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 크거나 같고, 1,000보다 작은 자연수이다.
//
//		출력
//		첫째 줄에는 A × B × C의 결과에 0 이 몇 번 쓰였는지 출력한다. 
//		마찬가지로 둘째 줄부터 열 번째 줄까지 A × B × C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		
		
		Scanner sc = new Scanner(System.in);
		
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		int d = a*b*c;
		String str = Integer.toString(d);
		
		for (int i = 0; i < 10; i++) {
			int count = 0;
			for(int j = 0; j <str.length(); j++) {
				if((str.charAt(j) -'0') == i) {
					count++;
				}
			}
			
			System.out.println(count);
		}
		
		
		
	}

}
