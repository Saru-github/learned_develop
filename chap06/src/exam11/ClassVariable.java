package exam11;

class InstCnt{
	
	static int instNum;
	
	InstCnt(){
		
		instNum++;
		System.out.println("인스턴스 생성: " + instNum);
	
	}
	
}

public class ClassVariable {

	public static void main(String[] args) {

		InstCnt cnt1 = new InstCnt();
		InstCnt cnt2 = new InstCnt();
		InstCnt cnt3 = new InstCnt();
		
	}

}
