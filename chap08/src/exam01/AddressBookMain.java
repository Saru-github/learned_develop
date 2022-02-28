package exam01;

import java.util.Scanner;

public class AddressBookMain {

	public static void main(String[] args) {

		
		
		
		Scanner sc = new Scanner(System.in);
		String name = "";
		String phoneNum = "";
		String address = "";
		int age = 0;
		
		
		
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		phoneNum = sc.nextLine();
		System.out.println("주소 입력: ");
		address = sc.nextLine();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		
		AddressBook friend1 = new AddressBook(name, phoneNum, address, age);
		
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		phoneNum = sc.nextLine();
		System.out.println("주소 입력: ");
		address = sc.nextLine();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		AddressBook friend2 = new AddressBook(name, phoneNum, address, age);
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		phoneNum = sc.nextLine();
		System.out.println("주소 입력: ");
		address = sc.nextLine();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		AddressBook friend3 = new AddressBook(name, phoneNum, address, age);
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		phoneNum = sc.nextLine();
		System.out.println("주소 입력: ");
		address = sc.nextLine();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		AddressBook friend4 = new AddressBook(name, phoneNum, address, age);
		System.out.println("이름 입력: ");
		name = sc.nextLine();
		System.out.println("핸드폰 번호 입력: ");
		phoneNum = sc.nextLine();
		System.out.println("주소 입력: ");
		address = sc.nextLine();
		System.out.println("나이 입력: ");
		age = sc.nextInt();
		AddressBook friend5 = new AddressBook(name, phoneNum, address, age);
		
		
		friend1.showInfo();
		friend2.showInfo();
		friend3.showInfo();
		friend4.showInfo();
		friend5.showInfo();
		
	}

}
