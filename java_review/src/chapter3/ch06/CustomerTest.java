package chapter3.ch06;

import java.util.ArrayList;

public class CustomerTest {

	public static void main(String[] args) {
		
		
		ArrayList<Customer> customerList = new ArrayList<>();
		
		Customer custmoerT = new Customer(10001, "Tomas");
		Customer custmoerJ = new Customer(10002, "James");
		Customer custmoerE = new GoldCustomer(10003, "Edward");
		Customer custmoerP = new GoldCustomer(10004, "Percy");
		Customer custmoerK = new VIPCustomer(10005, "Kim");
		
		customerList.add(custmoerK);
		customerList.add(custmoerJ);
		customerList.add(custmoerE);
		customerList.add(custmoerP);
		customerList.add(custmoerT);
		
		for(Customer customer : customerList) {
			System.out.println(customer.showCustomerInfo());
		}
		
		int price = 10000;
		
		for(Customer customer : customerList) {
			
			int cost = customer.calcPrice(price);
			System.out.println(customer.getCustomerName() + "님이 " + cost + "원을 지불 하셨습니다.");
			System.out.println(customer.getCustomerName() + "님의 현재 보너스 포인트는 " + customer.bonusPoint + " 입니다.");
		}
		
		
	}

}
