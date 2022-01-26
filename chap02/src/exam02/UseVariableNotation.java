package exam02;

public class UseVariableNotation {

	public static void main(String[] args) {
		
		byte num1, num2; // 변수선언 
		//byte num2;
		
		//num1 = 250; // error 발생
		num1 = 55; // 초기화
		num2 = 15;
		
		System.out.println(num1 - num2);
		System.out.println(num1+" - "+num2 + " = " + (num1-num2));
		
		
		int num3 = 512, num4 = 250;
		// 00010101 - > 21
		byte num5 = 025;
		System.out.println(num5);	// 8진법
		
		num5 = 0x15;
		System.out.println(num5);	// 16진법
		
		// 00011110 -> 30
		num5 = 036; 				
		System.out.println(num5); 
		
		num5 = 0x1e;				
		System.out.println(num5);
		
		
	}

}
