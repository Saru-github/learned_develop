package exam01;

class Orange {
	int sugarContent; // 당분 함량
	
	Orange(int sugarContent){
		this.sugarContent = sugarContent;
	}

	public void showSugarContent() {
		System.out.println("당분 함량: " + sugarContent	);
	}
	
}

class OrangeBox {
	Orange item;
	
	OrangeBox(){}
	
	public void store(Orange item) { // 포장
		this.item = item;
	}
	
	public Orange pullOut() { // 개봉
		return item;
	}
	
	
	
}
