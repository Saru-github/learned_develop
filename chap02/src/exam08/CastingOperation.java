package exam08;

public class CastingOperation {

	public static void main(String[] args) {

		char alphabet = 'Z';
		int unicode = ' ';
		long num = 10000000000000000L;
		float num2;
		
		unicode =  alphabet; // alphabet 에 담긴 char 변수가 int로 자동형변화
		num2 = num;
		
		System.out.println(alphabet);
		System.out.println(unicode);
		System.out.println(num2);
		
		
		byte num3 = 0;
		int num4 = 25;
		
		//	num3 = num4; // error
		num3 = (byte)num4;
		System.out.println(num3);
		
		// int score = 23.5; // error (단위가 작은 자료형으로 변환 불가)
		int score = (int)23.5; //강제형변환
		
		score = 0;
		double score2 = 23.5;
		
		score = (int)score2; // int 메모리를 새로 할당 후 double 값에 정수만 넣어줌 (score2 의 값은 변하지않음)
		
		System.out.println(score);
		System.out.println(score2);
		
		// float result = 0.5 + 19; 
		// float result = 19.5 (double) error
		double result = 0.5 + 19;  // = float result2 = (float)0.5 + 19;
		System.out.println(result);
		
		
		
		
		
		
		
	}

}
