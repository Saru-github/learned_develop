package exam03;

public class LogicOp {	// 논리 연산자 {&& (and) ,|| (or) , ! (not)}

	public static void main(String[] args) { 

		boolean X1 = false, X2 = false;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("===================================");
		
		X2 = true;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("===================================");
		
		X1 = true; X2 = false;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("===================================");
		
		X1 = true; X2 = true;
		
		System.out.println(X1 + " && " + X2 + " = " + (X1 && X2));
		System.out.println(X1 + " || " + X2 + " = " + (X1 || X2));
		System.out.println("===================================");
		
		System.out.println(!X1);
		
		
	}

}
