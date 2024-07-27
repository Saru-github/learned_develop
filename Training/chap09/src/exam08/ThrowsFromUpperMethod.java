package exam08;

import java.util.Scanner;

class AgeInputException extends Exception {

	AgeInputException() {
		super("유효하지 않은 나이를 입력하셨습니다.");
	}

}

public class ThrowsFromUpperMethod {

	public static void main(String[] args) {
		
		System.out.println("나이를 입력하세요: ");
		
		int age = 0;
		
		try {
			age = callAge();
		} catch (AgeInputException e) {
			e.printStackTrace();
		}
		System.out.println("당신의 나이는 " + age + "이군요.");
	}
	
	public static int callAge() throws AgeInputException {
		
		int age = readAge();
		return age;
	}

	public static int readAge() throws AgeInputException {
		Scanner input = new Scanner(System.in);
		int age = input.nextInt();

		if (age < 0) {
			AgeInputException excpt = new AgeInputException();
			throw excpt;
		}

		return age;
	}

}
