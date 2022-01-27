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
		
	}

}
