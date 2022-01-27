package exam07;

public class UseConstant {

	public static void main(String[] args) {

		// int num = 10000000000; error , long num = 1000000000; error (정수 상수는 int로 저장되어 있음)
		long num = 10000000000L;
		float pi = 3.14F; // float pi = 3.14; error (실수 상수는 double 형으로 저장되어 있음)
		
		
		System.out.println(num);
		System.out.println(pi);
		
	}
}
