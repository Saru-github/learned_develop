package exam15;

public class PrintfMethod {

	public static void main(String[] args) {

		int age = 20;
		double tall = 175.7;
		String name = "홍길동";
		
		System.out.println("제 이름은 " + name + " 입니다.");
		System.out.printf("제 이름은 %s 입니다.\n", name); 						// %s = 문자열
		System.out.printf("나이는 %d 살이고, 키는 %.1f입니다.\n", age, tall);	// %d = 정수 , %f = 실수(기본은 소수점 이하 6자리)
																				// %.nf -> 소수점이하 n자리 까지만 표현	
		System.out.printf("%d, 0x%x, 0%o\n", 77, 77, 77);						// %d = 10진수, %x = 16진수, %o = 8진수
		System.out.printf("%f, %e\n", 0.00014, 0.00014);						// %e = e형식의 실수로 출력
		System.out.printf("%g, %g\n", 0.00014, 0.000014);						// %g = f,e 중에 보기좋은 형태로 출력.	
		
		
	}

}
