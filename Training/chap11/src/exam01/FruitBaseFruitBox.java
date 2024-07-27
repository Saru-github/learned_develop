package exam01;

class FruitBaseFruitBox {

	public static void main(String[] args) {

		Apple apple = new Apple(500);
		AppleBox appleBox = new AppleBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = appleBox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("===============\n");
		
		Orange orange = new Orange(8);
		OrangeBox orangeBox = new OrangeBox();
		
		orangeBox.store(orange);
		
		Orange tmpOrange = orangeBox.pullOut();
		tmpOrange.showSugarContent();
		
		System.out.println("===============\n");
		
		// orangeBox.store("오렌지"); // 자료형에 안전, 개별 포장지 필요
 		
		
	}

}
