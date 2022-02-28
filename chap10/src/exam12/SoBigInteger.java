package exam12;

import java.math.BigInteger;

public class SoBigInteger {

	public static void main(String[] args) {
		
		System.out.println("최대정수: " + Long.MAX_VALUE);
		System.out.println("최소정수: " + Long.MIN_VALUE);
		
		// long num = 10000000000000000000L; // error
		
		BigInteger bigValue1 = new BigInteger("10000000000000000000");
		BigInteger bigValue2 = new BigInteger("-9999999999999999999");
		
		
		BigInteger addResult = bigValue1.add(bigValue2);
		BigInteger mulResult = bigValue1.multiply(bigValue2);
		
		System.out.println("큰 수의 덧셈 결과: " + addResult);
		System.out.println("큰 수의 곱셈 결과: " + mulResult);
		
	}

}
