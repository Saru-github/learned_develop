package exam05;
 
public class Buyer { // 참조자료형

	// filed

	String name;
	int myMoney; // 가진 돈
	int numOfApple; // 구매한 사과 갯수
	
	
	// constructor (생성자)

	// Buyer(){}

	public Buyer(String n, int money) {

		name = n;
		myMoney = money;
		numOfApple = 0;

	}

	// method (메서드)
	// 사과 구매 행위.
	
	public void buyApple(int money, Mart mart) {
		
		numOfApple += mart.saleApple(money);
		myMoney -= money;
		
	}
	
	// 가계부
	public void showBuyer() {
		System.out.println();
		System.out.println(name + "의 남은 돈: " + myMoney + "원, 구매한 사과의 갯수: " + numOfApple + "개");
		System.out.println("=======================================");

	}
	
}
