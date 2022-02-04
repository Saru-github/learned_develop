package exam03;

class StudentScore{ // 참조자료형
	
	// field (멤버변수)

	String name;
	int quiz1; 
	int midTerm;
	int quiz2;
	int finalTerm;
	
	public StudentScore() { // Constructor (생성자)

		System.out.println("StudentScore() 호출...");
		
	}
	
	public StudentScore(String n, int q1, int mid, int q2, int f) { // final 은 약속된 예약어
		name = n;
		quiz1 = q1;
		midTerm = mid;
		quiz2 = q2;
		finalTerm = f;
	}
	
	
	// (멤버) 메서드
	public int sum() {
		
		int result = 0;
		
		result = quiz1 + midTerm + quiz2 + finalTerm;
		return result;
		
		
	}
	
	public int avg() {
		
		int result = 0;
		
		result = ( quiz1 + midTerm + quiz2 + finalTerm ) / 4;
		return result;
	}
	
}


public class ConstructorOOp {

	public static void main(String[] args) {
		
		System.out.println("프로그램 시작...");
		
		
		
		// StudentScore = hongKildong;			// 참조변수
		// hongKildong = new StudentScore();	// Instance 화 
		
		
		StudentScore hongKilDong = new StudentScore("홍길동", 85, 80, 90, 95);
		
		
//		hongKilDong.name = "홍길동"; // 메모리접근방법 (저장)
//		hongKilDong.quiz1 = 85;
//		hongKilDong.midTerm = 80;
//		hongKilDong.quiz2 = 90;
//		hongKilDong.finalTerm = 95;
		
		
		
		
		
		System.out.println();
		System.out.println(hongKilDong.name+" 학생의 4 과목의 점수 합: "+ hongKilDong.sum());
		System.out.println(hongKilDong.name+" 학생의 4 과목의 점수 평균: "+ hongKilDong.avg());
		System.out.println();
		
		System.out.println("프로그램 종료...");

	}

}
