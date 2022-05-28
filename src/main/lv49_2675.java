package main;

import java.util.Scanner;

public class lv49_2675 {

	public static void main(String[] args) {

		
//		2675
//		
//		입력
//		첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 
//		각 테스트 케이스는 반복 횟수 R(1 ≤ R ≤ 8), 문자열 S가 공백으로 구분되어 주어진다. S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 
//
//		출력
//		각 테스트 케이스에 대해 P를 출력한다.
		
		
			Scanner sc = new Scanner(System.in);
			
			int T = sc.nextInt();
			for(int i = 0; i < T; i++) {
		
				int R = sc.nextInt();
				String S = sc.next();	// nextLine() 을 쓰면 error!
				
				for(int j = 0; j < S.length(); j++) {           
					for(int k = 0; k < R; k++) {	// R 만큼 반복 출력
						System.out.print(S.charAt(j));
					}
				}
	            
				System.out.println();
			}
		}
	}
