package exam08;

public class BitOp { // 비트 연산자

	public static void main(String[] args) {

		 int num1 = 5, num2 = 3;
		 
		 System.out.println(num1 & num2); // 101 & 011 = 001
		 System.out.println(num1 | num2); // 101 | 011 = 111
		 System.out.println(num1 ^ num2); // 101 ^ 011 = 110 
		 System.out.println(~num2);
		 
	}

}
