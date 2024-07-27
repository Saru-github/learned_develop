package chapter3.ch03;

public class CustomerTest {

	public static void main(String[] args) {

		
		
		Customer customerLee = new Customer(1000, "이순신");
//		customerLee.setCustomerName("이순신");
//		customerLee.setCustomerID(1000);
		customerLee.bonusPoint = 100;
		
		System.out.println(customerLee.showCustomerInfo());
		
		VIPCustomer customerKim = new VIPCustomer(2000, "김유신");
//		customerKim.setCustomerName("김유신");
//		customerKim.setCustomerID(2000);
		customerKim.bonusPoint = 200;
		
		System.out.println(customerKim.showCustomerInfo());
		
	}

}
