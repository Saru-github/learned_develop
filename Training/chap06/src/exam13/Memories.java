package exam13;
 

public class Memories {

	public static void main(String[] args) {

		
		// *메모리 저장 및 구분 방법
		
		// 메서드 영역 (method) 	- 프로그램이 시작할때부터 종료 될 때까지 보관되는 메모리의 영역 
		//							- 바이트코드(자바를 실행시키고 동작하기 위해 JVM에 의해서 실행되는 코드), static 으로 선언된 클래스 변수
		
		// 스택 영역 (stack) 		- 지역변수, 매개변수
		// 힙 영역 (heap)			- 인스턴스
		
		
//		ex)
		
//		Mart mart1 = new Mart("풍성마트", 0, 100, 1000); 	// Mart 를 만나면, Static 변수가 있는지 확인,없기때문에 Method 영역에 할당하지 않음.
//															// Mart mart1 이 Stack 영역에 생성됨. new 를 만나면서, Heap 영역에 this.필드/생성자/메소드/ 생성
															// Stack 영역에 선언된 Mart mart1 를 통해 Heap 영역의 this. 로 얻은 주소값의 메모리를 바라봄.
															// Heap 영역을 바라보는 Stack 영역의 참조변수가 더이상 Heap영역의 데이터를 참조하지 않는다면,
															// Heap 메모리의 데이터를 자동 소멸.
		
//		Mart mart2 = new Mart("이마트", 0, 200, 2000);
//		
//		Buyer buyer1 = new Buyer("대영", 100000);
//		buyer1.buyApple(5000, mart1);
//		buyer1.buyApple(2000, mart1);
//		buyer1.showBuyer();
															// 참조변수가 계속 사용되기 때문에, 프로그램이 끝날 시점이 되어서야 메모리 자동소멸.
//		e_mart = null; 										// 참조변수를 null로 초기화한다면, Heap 메모리와의 연결을 끊고, 메모리가 자동 으로 소멸된다.
	
		
	}

	
	
}
