package chapter3.ch15;

public class CustomerTest {

	public static void main(String[] args) {
		
		Customer cus = new Customer();
		cus.buy();
		cus.sell();
		cus.order();
		cus.hello();
		
		Buy buyer = cus;
		buyer.buy();
		buyer.order();
		
		Sell seller = cus;
		seller.sell();
		seller.order();

	}

}
