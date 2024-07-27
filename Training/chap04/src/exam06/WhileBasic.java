package exam06;

public class WhileBasic {

	public static void main(String[] args) {

		// 1~100 의 합은 = ?
		
		// int result = 0;
		// result = 1+2+3+4+5 ... + 99 + 100;\
		// System.out.println(result);

		int num = 1;
		int result = 0;
		
		while(num <= 100) { //(num <= 1000000000 , result -> long result 필요
			System.out.println("명령문 실행: " + num);
			
			result += num;
			//System.out.println("누적 값 "+ result);
			num++;

		}
		System.out.println("");
		System.out.println("num의 값 : "+num);
		System.out.println("1~100 합계: "+result);
	}

}
