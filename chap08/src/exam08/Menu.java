package exam08;

import java.util.Scanner;

class Menu {
	FriendController controller;
	
	Menu(){
		controller = new FriendController();
	}
	
	public void displayMenu() {
		while(true) {
			System.out.println("*****  메뉴 선택  *****");
			System.out.println("0. 프로그램 종료.");
			System.out.println();
			System.out.println("1. 중학교 친구 정보 저장.");
			System.out.println("2. 고등학교 친구 정보 저장.");
			System.out.println("3. 대학교 친구 정보 저장.");
			System.out.println();
			System.out.println("4. 중학교 친구 정보 출력.");
			System.out.println("5. 고등학교 친구 정보 출력.");
			System.out.println("6. 대학교 친구 정보 출력.");
			System.out.println("7. 모든 친구 정보 출력.");
			System.out.println();
			
			System.out.print("원하는 항목 번호를 선택하세요 >> ");
			
			Scanner input = new Scanner(System.in);
			
			int choice = input.nextInt();
					
			System.out.println();
			
			switch(choice) {
			case 0:
				System.out.println("프로그램을 종료합니다.");
				return;
			case 1: case 2: case 3:
				controller.addFriend(choice);
				break;
			case 4:
				System.out.println("----------------친구목록-----------------");
				if (controller.getIndexOfFriend()==0) {
					System.out.println("친구목록이 없습니다. 저장 후 이용해 주세요.");
				} else {
				controller.displayFriendInfo();
				}
				System.out.println("-----------------------------------------");
				break;
				
			default:
				System.out.println("잘못된 입력을 하셨습니다.");
				System.out.println("번호를 확인하세요.");
				break;
			}
			
			System.out.println();
		}
	}
}





