package quiz04;

class Buyer { // 구매자
	private String appleBuyer;
	private int myMoney; // 가진 돈
	private int numOfApple; // 구매한 사과 갯수

	Buyer(String buyer, int money) {
		appleBuyer = buyer;
		myMoney = money;
		numOfApple = 0;
	}

	// 행위, 기능
	// 사과 구매한다.
	public void buyApple(int money, Mart appleSeller) {// 메인 클래스 외의 다른 클래스에서는 static을 쓰지 않는다.
		numOfApple += appleSeller.sellApple(money);
		myMoney -= money;
	}

	public void showBuyer() { // 출력
		System.out.println(appleBuyer + "이/가 구매한 사과 갯수 : " + numOfApple);
		System.out.println(appleBuyer + " 남은 돈 : " + myMoney);
	}
}
