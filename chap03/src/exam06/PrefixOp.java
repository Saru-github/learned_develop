package exam06;

public class PrefixOp {

	public static void main(String[] args) {

		int num1 = 7;
		int num2 = 0, num3 =0;

		num2 = ++num1; // 전위증가 연산자 , num1 += 1;
		System.out.println("num1 = " +num1);
		System.out.println("num2 = " +num2);
		System.out.println("");
		
		
		num3 = ++num1 + 20;						// ++expr 먼저 증가 시키고 값증가
		System.out.println("num1 = " +num1); 
		System.out.println("num3 = " +num3); 
		
		--num1; // 전위감소 연산자, num1 -= 1;  
		System.out.println(num1);
		
		
		
		
	}

}
