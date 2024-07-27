package exam10;

abstract class Friend { // 공통 특징(부모클래스)
	// field
	private String name; // 이름
	private String phoneNum; // 폰번호
	private String address; // 주소
	
	Friend(){}
	
	// Constructor
	Friend(String name, String phoneNum, String address){
		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
	}
	
	// Method
	public void displayFriendInfo() {
		System.out.println("이름:" + name);
		System.out.println("폰번호:" + phoneNum);
		System.out.println("주소:" + address);
	}
	
	public String getName() {
		return name;
	}
	
	//public void displayBasicFriendInfo() {}
	abstract public void displayBasicFriendInfo(); // 추상메서드 , abstract method
	
}

