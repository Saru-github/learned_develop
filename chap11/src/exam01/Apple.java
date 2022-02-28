package exam01;

class Apple {

	int weight; // 사과의 중량

	Apple(int weight) {
		this.weight = weight;
	}

	public void showAppleWeight() {
		System.out.println("사과의 중량: " + weight);
	}

}

class AppleBox {
	Apple item;

	AppleBox() {
	}

	public void store(Apple item) { // 포장
		this.item = item;
	}

	public Apple pullOut() { // 개봉
		return item;
	}

}
