package exam09;

public class KeywordThis {

	public static void main(String[] args) {

		Person person1 = new Person("철수", 20220209);	// 1. 메모리 할당 2. this = 시작주소 값
		Person person2 = new Person("영희");			// 3. 생성자 호출 4. return this
		
		person1.showInfo();								
		person2.showInfo();
		
	}

}
