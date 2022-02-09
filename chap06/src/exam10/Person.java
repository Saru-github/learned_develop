package exam10;

class Person {

	private String name; // 이름
	private int milID; // 군번
	private int birthYear; // 년
	private int birthMonth; // 월
	private int birthDay; // 일

	Person(String name, int milID, int birthYear, int birthMonth, int birthDay) {
		
		this.name = name;
		this.milID = milID;
		this.birthYear = birthYear;
		this.birthMonth = birthMonth;
		this.birthDay = birthDay;
	}

	Person(String name, int birthYear, int birthMonth, int birthDay) {
		
		this(name, 0, birthYear, birthMonth, birthDay);
		
//		this.name = name;
//		this.milID = 0;
//		this.birthYear = birthYear;
//		this.birthMonth = birthMonth;
//		this.birthDay = birthDay;
		
	}
	
	Person(String name, int birthYear, int birthMonth){
		this(name, 0, birthYear, birthMonth, 0);
		
	}

	public void showInfo() {
		System.out.println("이름: " + name);
		
		if (milID == 0) {
			System.out.println("군번이 없습니다.");
			System.out.println("출생연도: " + birthYear);
			System.out.println("출생월: " + birthMonth);
		} else {
			System.out.println("군번: " + milID);
			System.out.println("출생연도: " + birthYear);
			System.out.println("출생월: " + birthMonth);
			System.out.println("출생일: " + birthDay);
		}
	}

}
