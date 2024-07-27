package quiz04;

/*

문제) 
철수 가진 돈 : 10,000원
영희 가진 돈 : 30,000원
미애 가진 돈 : 50,000원

이마트    : 개당 사과 가격 -> 1,000원, 100개의 사과
홈플러스 : 개당 사과 가격 -> 2,000원, 50개의 사과
를 가지고 판매를 시작할  때,

철수는 이마트에서 5,000원 / 홈플러스에서 2,000원
영희는 이마트에서 8,000원 / 홈플러스에서 12,000원
미애는 이마트에서 20,000원 / 홈플러스에서 10,000원
어치를 구매할 때,

이마트 및 홈플러스의 이익 및 철수, 영희, 미애의 가계부
정산 프로그램을 작성하세요.

 */

public class Quiz04 {
	public static void main(String[] args) {
		Mart e_mart = new Mart("이마트", 100, 1000);
		Mart homeplus = new Mart("홈플러스", 50, 2000);
		
		Buyer cheolsoo = new Buyer("철수", 10000);
		Buyer younghee = new Buyer("영희", 30000);
		Buyer miae = new Buyer("미애", 50000);
		
		cheolsoo.buyApple(5000, e_mart);
		cheolsoo.buyApple(2000, homeplus);
		
		younghee.buyApple(8000, e_mart);
		younghee.buyApple(12000, homeplus);
		
		miae.buyApple(20000, e_mart);
		miae.buyApple(10000, homeplus);
		
		System.out.println("== 이마트 최종 정산 ==");
		e_mart.showMart();
		System.out.println();
		
		System.out.println("== 홈플러스 최종 정산 ==");
		homeplus.showMart();
		System.out.println();
		
		System.out.println("== 철수 가계부 정산 ==");
		cheolsoo.showBuyer();
		System.out.println();
		
		System.out.println("== 영희 가계부 정산 ==");
		younghee.showBuyer();
		System.out.println();
		
		System.out.println("== 미애 가계부 정산 ==");
		miae.showBuyer();
		System.out.println();

	}
}
