package exam04;

public class AppleMain {

	public static void main(String[] args) {

		Mart mart1 = new Mart("풍성마트", 0, 100, 1000);

		Mart mart2 = new Mart("이마트", 0, 200, 2000);
		
		Buyer buyer1 = new Buyer("대영", 100000);
		buyer1.buyApple(5000, mart1);
		buyer1.buyApple(2000, mart1);
		buyer1.showBuyer();
		
	}

}
