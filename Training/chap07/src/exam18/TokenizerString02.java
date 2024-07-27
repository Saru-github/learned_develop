package exam18;

import java.util.StringTokenizer;

public class TokenizerString02 {

	public static void main(String[] args) {

		String phoneNum = "TEL 82-02-1234-5678";
		
		System.out.println("First Result ===");
		StringTokenizer st1 = new StringTokenizer(phoneNum);
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());   // space bar 를 default 구분자로 지정.
		}
		
		System.out.println("Second Result ===");
		st1 = new StringTokenizer(phoneNum, " -"); // 여백, - 둘다 구분자로 지정
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());   
		}
		
		System.out.println("Third Result ===");
		st1 = new StringTokenizer(phoneNum, " -", true); // 구분자 출력 or 미출력, default는 false
		
		while(st1.hasMoreTokens()) {
			System.out.println(st1.nextToken());  
		}
		
	}

}
