package exam08;

public class MiddleFriend extends Friend {
	
	private String marriage;


	public MiddleFriend(String name, String phoneNum, String address, String marriage) {
		super(name, phoneNum, address);
		this.marriage = marriage;
	}
	
	public void displayFriendInfo() {
		super.displayFriendInfo();
		System.out.println("결혼유무: " + marriage);
	}

}
