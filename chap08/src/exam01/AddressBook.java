package exam01;

class AddressBook {

	String name;
	String phoneNum;
	String address;
	int age;

	AddressBook(String name, String phoneNum, String address, int age) {

		this.name = name;
		this.phoneNum = phoneNum;
		this.address = address;
		this.age = age;
		
	}
	
	public void showInfo() {
		
		System.out.println("친구의 이름: " + name);
		System.out.println("친구의 번호: " + phoneNum);
		System.out.println("친구의 주소: " + address);
		System.out.println("친구의 나이: " + age);
	}

}
