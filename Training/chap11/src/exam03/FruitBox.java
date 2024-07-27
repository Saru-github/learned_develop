package exam03;

class FruitBox<T> {
	T item;

	FruitBox() {
	}

	public void store(T item) { // 포장
		this.item = item;
	}

	public T pullOut() { // 개봉
		return item;
	}

}
