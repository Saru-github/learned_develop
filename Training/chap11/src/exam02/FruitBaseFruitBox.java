package exam02;

class FruitBaseFruitBox {

	public static void main(String[] args) {

		Apple apple = new Apple(500);
		FruitBox appleBox = new FruitBox();
		
		appleBox.store(apple);
		
		Apple tmpApple = (Apple)appleBox.pullOut();
		
		tmpApple.showAppleWeight();
		
		System.out.println("===============\n");
		
		Orange orange = new Orange(8);
		FruitBox orangeBox = new FruitBox();
		
		orangeBox.store(orange);
		
		Orange tmpOrange = (Orange)orangeBox.pullOut();
		tmpOrange.showSugarContent();
		
		System.out.println("===============\n");
		
		orangeBox.store("오렌지"); // 범용적 포장지. 자료형 안전하지 않음.
		
	}

}
