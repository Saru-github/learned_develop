package exam11;

import java.util.Random;

public class RandomNumberGenerator {

	public static void main(String[] args) {

		Random random = new Random();
		
		int num = random.nextInt(100) + 1;
		System.out.println("1~100 사이의 임의의 값: " + num);
		
		double num2 = random.nextDouble();
		System.out.println("0.0 ~ 1.0 사이의 임의의 실수값: "+num2); // 0.0~100.0  =  num2*100
		
		boolean num3 = random.nextBoolean();
		System.out.println("임의의 논리 값: " + num3);
		
		
		
		
	}

}
