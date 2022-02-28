package exam01;

class Friend { // 공통의 데이터

	private String name; // 이름
	private String birth; // 생년월일
	private String address; // 주소
	private String email; // 이메일

	Friend(String name, String birth, String address, String email) {
		this.name = name;
		this.birth = birth;
		this.address = address;
		this.email = email;
	}

	public void displayFriendInfo() {

		System.out.println("이름: " + name);
		System.out.println("생일: " + birth);
		System.out.println("주소: " + address);
		System.out.println("이메일: " + email);
	}
}
