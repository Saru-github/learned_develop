package quiz05;

class Friend {
	private String name;
	private String phone;
	private String address;
	private int age;
	
	Friend(String name, String phone, String address, int age){
		this.name = name;
		this.phone = phone;
		this.address = address;
		this.age = age;
	}
	
	public void showInfo(){
		System.out.println("이름: " + name);
		System.out.println("폰번호: " + phone);
		System.out.println("주소: " + address);
		System.out.println("나이: " + age);
	}
	
}
