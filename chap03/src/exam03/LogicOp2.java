package exam03;

public class LogicOp2 {

	public static void main(String[] args) {
		
		
		int num1 = 10, num2 = 20;
		boolean result = false;
	
		System.out.println(num1 == 10);
		
		result = (num1 == 10) && (num2 == 30); // 연산순서: 산술->비교->논리  result = true && false;
		System.out.println(result);
		
		result = (num1 >= 10) || (num2 <= 30); 
		System.out.println(result);
		
		
		
	}

}
