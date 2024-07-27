package exam09;

public class BitShiftOp { // 비트시프트 연산자

	public static void main(String[] args) {

		byte num = 2;
		
		System.out.println(num << 1);
		System.out.println(num << 2);
		
		num = 8;
		
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		
		num = -8;
		System.out.println(num >> 1);
		System.out.println(num >> 2);
		
		System.out.println(num >>> 1);
		
	}

}
