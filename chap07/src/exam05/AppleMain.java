package exam05;

public class AppleMain {

	public static void main(String[] args) {

//		Mart e_mart = new Mart(0, 100, 1000);
//		Mart homeplus = new Mart(0, 200, 2000);
//		Mart lotte_mart = new Mart(0, 150, 3000);
//		
//		Buyer mother = new Buyer(100000);
//		Buyer father = new Buyer(50000);
//		Buyer son = new Buyer(10000);
		
		
		Mart[] mart = new Mart[3];
		
//		for(int i = 0; i < mart.length; i++) {
//			System.out.println(mart[i]);
//		}
		
		mart[0] =new Mart(0, 100, 1000);
		mart[1] =new Mart(0, 200, 2000);
		mart[2] =new Mart(0, 150, 3000);
		
//		for(int i = 0; i < mart.length; i++) {
//			System.out.println(mart[i]);
//		}
		
		Buyer buyer[] = new Buyer[3];
		buyer[0] = new Buyer(100000);
		buyer[1] = new Buyer(50000);
		buyer[2] = new Buyer(10000);
		
		// 어머니가 홈플러스에 가서 사과 4000원 어치 구매.
		buyer[0].buyApple(4000, mart[1]);
		buyer[0].buyApple(2000, mart[1]);
		buyer[0].buyApple(2000, mart[1]);
		
		buyer[0].showBuyer();
		mart[1].showSeller();
	
		
		Buyer buyer1[] = new Buyer[3];
		buyer1[0] = new Buyer("철수", 10000);
		buyer1[1] = new Buyer("영희", 30000);
		buyer1[2] = new Buyer("미애", 50000);
		
		System.out.println(buyer1[0].name);
		
		Mart mart1[] = new Mart[2];
		mart1[0] = new Mart("이마트", 0, 1000, 100);
		mart1[1] = new Mart("홈플러스", 0, 2000, 50);
		
		buyer1[0].buyApple(5000, mart[0]);
		buyer1[0].buyApple(2000, mart[1]);
		buyer1[1].buyApple(8000, mart[0]);
		buyer1[1].buyApple(12000, mart[1]);
		buyer1[2].buyApple(20000, mart[0]);
		buyer1[2].buyApple(10000, mart[1]);
		
		buyer[0].showBuyer();
		buyer[1].showBuyer();
		buyer[2].showBuyer();
	
		mart1[0].showSeller();
		mart1[1].showSeller();
		
	}

}
