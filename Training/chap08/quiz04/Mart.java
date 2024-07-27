package quiz04;

class Mart { // 사과장수 객체
	private String martName;
	private int benefit;// 이윤
	private int numberApple;// 사과 갯수
	private final int APPLE_PRICE;// 사과 단가

	Mart(String name, int num, int price) {
		martName = name;
		benefit = 0;
		numberApple = num;
		APPLE_PRICE = price;
	}

	public int sellApple(int cost) {
		int num = 0;

		benefit += cost;
		num = cost / APPLE_PRICE;
		numberApple -= num;

		return num;
	}

	public void showMart() { // 출력
		System.out.println(martName + " 이윤 : " + benefit);
		System.out.println(martName + " 남은 사과 갯수 : " + numberApple);
	}
}
