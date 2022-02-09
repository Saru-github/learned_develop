package exam09;

class Person {

	private String name; // 이름
	private int milID; // 군번

	Person(String name, int milID) {
		this.name = name;
		this.milID = milID;
	}

	Person(String name) {
		this.name = name;
		this.milID = 0;
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		if (milID == 0) {
			System.out.println("군번이 없습니다.");
		} else {
			System.out.println("군번: " + milID);
		}
	}

}
