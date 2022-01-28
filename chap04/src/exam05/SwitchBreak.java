package exam05;

public class SwitchBreak {

	public static void main(String[] args) {

		int num = 5; // 아침1/점심2/저녁3
		String name = "김유신";

		switch (num) {
		case 1:
			System.out.println("정수의 값은 1이에요.");
			System.out.println("Good Morning, Java!");
			break;
		case 2:
			System.out.println("정수의 값은 2에요.");
			System.out.println("Good Afternoon, Java!");
			break;
		case 3:
			System.out.println("정수의 값은 3이에요.");
			System.out.println("Good Evening, Java!");
			break;

		default:
			System.out.println("정수의 값을 1~3 으로 입력해주세요.");
			System.out.println("Hello, Java!");
			break;

		}

		switch (name) { // 7버전 이후

		case "김유신":
		case "이순신":
		case "홍길동":
			System.out.println("제 이름은 " + name + " 입니다.");
			break;
		default:
			System.out.println("이름을 알 수 없습니다.");
			break;

		}

		System.out.println("프로그램 종료.");

	}

}
