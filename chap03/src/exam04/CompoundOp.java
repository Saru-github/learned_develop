package exam04;

public class CompoundOp { //복합 대입 연산자

	public static void main(String[] args) {

		int num = 125;
		//int result = 0;
		
		num += 50; // 누적의 의미. num = num + 50; 
		System.out.println(num);
		
		num -= 50; // num = num - 50; 
		System.out.println(num);
		
		num *= 50; // num = num * 50; 
		System.out.println(num);
		
		num /= 50; // num = num / 50; 
		System.out.println(num);
		
		num %= 50; // num = num % 50; 
		System.out.println(num);
		
		
		
	}

}
