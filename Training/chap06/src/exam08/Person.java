package exam08;
 
class Person {

	private String name; // 이름
	private int milID; // 군번

	Person(String n, int mID) {
		name = n;
		milID = mID;
	}

	Person(String n) {
		name = n;
		milID = 0;
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
