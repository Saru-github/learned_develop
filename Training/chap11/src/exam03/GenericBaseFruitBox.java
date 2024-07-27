package exam03;

public class GenericBaseFruitBox {

	public static void main(String[] args) {
		
		Orange orange = new Orange(7);
		Apple apple = new Apple(700);
		
		FruitBox<Orange> orangeBox = new FruitBox<Orange>();
		FruitBox<Apple> appleBox = new FruitBox<Apple>();
		
		orangeBox.store(orange);
		// orangeBox.store("오렌지");	// error
		// orangeBox.store(apple);		// error
		
		appleBox.store(apple);
		
		Orange tmpOrange = orangeBox.pullOut();
		tmpOrange.showSugarContent();
		
		Apple tmpApple = appleBox.pullOut();
		tmpApple.showAppleWeight();
		
	}

}
