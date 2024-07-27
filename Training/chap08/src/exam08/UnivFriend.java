package exam08;

class UnivFriend extends Friend{ // 대학교 친구(자식클래스)
	
	private String major;// 전공
	
	UnivFriend(String name, String phoneNum, String address, String major){
		super(name, phoneNum, address);// 부모 필드(field) 초기화 의무
		this.major = major;
	}
	
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("전공:" + major);
	}

}
