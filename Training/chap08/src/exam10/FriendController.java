package exam10;

import java.util.Scanner;

class FriendController {

	Friend[] friend;
	final private int MAX_FRIEND;
	private int indexOfFriend;

	FriendController() {

		MAX_FRIEND = 300;
		indexOfFriend = 0;
		friend = new Friend[MAX_FRIEND];
	}

	public void addFriend(int choice) {
		Scanner input = new Scanner(System.in);
		String name = null, phone = null, address = null;
		String work = null, major = null, marriage = null;

		System.out.print("이름을 입력하세요:");
		name = input.nextLine();

		System.out.print("전화번호를 입력하세요:");
		phone = input.nextLine();

		System.out.print("주소를 입력하세요:");
		address = input.nextLine();

		if (choice == 1) {

			System.out.println("직업을 입력하세요:");
			work = input.nextLine();

			friend[indexOfFriend++] = new HighFriend(name, phone, address, work);

		} else if (choice == 2) {
			System.out.print("전공을 입력하세요:");
			major = input.nextLine();

			friend[indexOfFriend++] = new UnivFriend(name, phone, address, major);
		}
	}

	public void displayFriendInfo() {
		for (int i = 0; i < indexOfFriend; i++) {
			friend[i].displayFriendInfo();
		}
//			if (friend[i] instanceof UnivFriend) {
//				((UnivFriend) friend[i]).displayUnivFriendInfo();
//			} else if (friend[i] instanceof HighFriend) {
//				((HighFriend) friend[i]).displayHighFriendInfo();
//			}
		System.out.println();
	}

	public void displayBasicFriendInfo() {
		for (int i = 0; i < indexOfFriend; i++) {
			friend[i].displayBasicFriendInfo();
		}
	}

	public int getIndexOfFriend() {
		return indexOfFriend;
	}

}
