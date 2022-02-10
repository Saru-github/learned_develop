package exam11;

class InstCnt{
	 
	static int instNum; // 처음 읽을 때 우선적으로 메모리를 할당.
	
	InstCnt(){
		
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	
	}
	
}

public class ClassVariable {

	public static void main(String[] args) {
		
		// 처음 InstCnt 을 보는순간 , InstCnt 의 클래스에서 static 변수를 찾아서 메모리에 우선 할당.
		
		InstCnt.instNum = 10;  //static 변수, class 변수 로 불림.
		
		InstCnt.instNum++;
		System.out.println(InstCnt.instNum);
		
		
		InstCnt cnt1 = new InstCnt(); // 미리 만들어진 static int instNum < 은 cnt1, cnt2, cnt3 가 모두 공유함. (고정값)
		InstCnt cnt2 = new InstCnt(); // new 하면서 메모리를 할당할 때, static 변수는 만들지 않고 미리 만들어진 기존 메모리 사용
		InstCnt cnt3 = new InstCnt();
		
		System.out.println(cnt1.instNum);
		System.out.println(cnt2.instNum);
		System.out.println(cnt3.instNum);
		
	}

}
