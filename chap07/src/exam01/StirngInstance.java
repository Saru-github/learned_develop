package exam01;

public class StirngInstance {

	public static void main(String[] args) {

		String hello = "안녕하세요?";
		String hello2 = new String("안녕하세요, 여러분~"); // 같은 의미, 범용적으로 사용하기 때문에 생략해도 같은 동작을 하게끔 설계 됨. 
		
		
		
		
		System.out.println(hello);
		System.out.println(hello2);
		System.out.println(hello2.length()); 			// 여백 및 문자 포함
		
		
		String name1 = new String("홍길동"); 	// 기존대로 heap 메모리에 데이터 저장 
		String name2 = new String("홍길동"); 	// new 로 메모리를 할당시 하드웨어에 메모리를 할당 하기때문에, 누적되면 성능저하가 올 수 있음.
		
		String name3 = "홍길동"; 			// 약식으로 문자열을 저장하면, heap 메모리 별도공간에 따로 문자열 관리
		String name4 = "홍길동";			// new 와, 약식을 비교했을때 메모리 할당보다 문자열 비교가 훨씬 좋은 퍼포먼스를 제공.
		
		System.out.println(name1);
		
		
		
		if(name1 == name2) {
			System.out.println("동일 인스턴스 참조.");
		} else {
			System.out.println("다른 인스턴스 참조.");
		}
		
		
		if(name3 == name4) {
			System.out.println("동일 인스턴스 참조.");
		} else {
			System.out.println("다른 인스턴스 참조.");
		}
		
		
		
		//String str = "Hello, Java World !!!"; 
		//int length = str.length(); 
		
		int length = "Hello, Java World !!!".length();
		System.out.println(length);
		
	}

}







