package exam04;

class Mart { // 참조자료형 (판매자)

	// filed (멤버변수) -속성

	String name;
	int benefit; // 이윤
	int numberApple; // 잔여사과갯수
	final int APPLE_PRICE; // final -> 상수로 선언, 대문자 표

	// constructor (생성자)

	// Mart() {} // default 생성자 생략가능. (아무런 생성자가 없을 시, 자바가 기본 생성자를 만들어 줌.

	Mart(String n, int bf, int num, int price) {

		name = n;
		benefit = bf;
		numberApple = num;
		APPLE_PRICE = price;

	}

	// method (메서드) -기능/동작(사물), 행위(사람)
	// 사과 판매 행위.

	public int saleApple(int cost) {

		int number = 0;

		benefit += cost;
		number = cost / APPLE_PRICE;

		numberApple -= number;
		

		return number;

	}

	public void showSeller() {
		System.out.println();
		System.out.println(name + "의 오늘의 이윤: " + benefit + "원, 남은 사과의 갯수: " + numberApple + "개");
		System.out.println("=======================================");
	}

}
