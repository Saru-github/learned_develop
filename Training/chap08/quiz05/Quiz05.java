package quiz05;

import java.util.Scanner;

/*
   문제)
	키보드로 5명의 
		
	- 친구 이름(String),
	- 핸드폰번호(String),
	- 주소(String),
	- 나이(int)
		
	를 입력 받아 저장하고, 입력 받은 데이터를 출력하는 
	주소록 관리 프로그램을 배열(참조자료형)을 이용하여 객체 지향적 관점으로 작성해 보세요.
*/

public class Quiz05 {
	public static void main(String[] args) {
		Friend[] friend = new Friend[5];
		Scanner keyboard = new Scanner(System.in);
		
		System.out.println("5명의 친구 정보를 입력하세요.");
		
		for(int i=0; i<5; i++){
			System.out.printf("%d번째 친구의 이름을 입력하세요: ", i+1);
			String name = keyboard.nextLine();
			
			System.out.printf("%d번째 친구의 전화번호를 입력하세요: ", i+1);
			String phone = keyboard.nextLine();
			
			System.out.printf("%d번째 친구의 주소를 입력하세요: ", i+1);
			String address = keyboard.nextLine();
			
			System.out.printf("%d번째 친구의 나이를 입력하세요: ", i+1);
			int age = keyboard.nextInt();
			
			friend[i] = new Friend(name, phone, address, age);
			
			keyboard.nextLine();
		}
		
		System.out.println("===   친구 정보 출력  ===");
		for(int i=0; i<5; i++){
			friend[i].showInfo();
			System.out.println("--------------------");
		}
	}
}
