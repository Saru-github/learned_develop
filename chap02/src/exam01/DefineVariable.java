package exam01;

public class DefineVariable {

	public static void main(String[] args) {
		// 5489 + 9527 = ?
		// System.out.println(5489 + 9527);
		
		int data1; 						// (1) 메모리 저장 공간 할당.
		int data2;
		int sum;
		
		//int int; // 예약어 사용 금지
		//int 1data; // 숫자 시작 불가
		int data_1;
		
		
		data1 = 5489; 					// (2) 메모리 접근 방법(데이터 저장)
		data2 = 9527;
		
		
		System.out.println(data1);		// (3) 메모리 접근 방법(데이터 읽어 오기)
		System.out.println(data2);
		System.out.println(data1 + data2);
		
		sum = data1 + data2;
		
		System.out.println(sum);
		System.out.println(sum / 100); 
		
		data1 = 1234; 					// 기존 메모리에 데이터 재할당 가능
		data2 = 4321; 
		
		System.out.println(data1);
		System.out.println(data2);
		
		
	}

}
