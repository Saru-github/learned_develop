package exam01;

public class MethodDef {

	public static void main(String[] args) {

		// 1. 프로그램의 시작.
		System.out.println("프로그램 시작.........");

		// 사용자가 정의한 메서드 호출 방법.
		multiple(10, 20);

		gugu5dan();

		gugudan(3);

		gugualldan();

		// 2. 프로그램의 종료.
		System.out.println("프로그램 종료.........");
	}

	// 메서드 정의 방법.
	public static void multiple(int n1, int n2) {
		System.out.println("* 1 ~ 100 사이의 " + n1 + "의 배수 이고, " + n2 + "의 배수인 (양의)정수를 출력.");

		for (int i = 1; i <= 100; i++) {
			if ((i % n1 == 0) && (i % n2 == 0)) {
				System.out.println(i);
			}
		}

	}

	public static void gugu5dan() {
		// 5단 출력
		for (int i = 1; i < 10; i++) {
			System.out.println("5 X " + i + " = " + (5 * i));
		}
	}

	public static void gugudan(int num) {
		System.out.println();
		System.out.println("* " + num + "단 출력");

		for (int i = 1; i < 10; i++) {
			System.out.println(num + " X " + i + " = " + (num * i));

		}
	}

	public static void gugualldan() {
		for (int i = 2; i < 10; i++) {
			System.out.println();
			System.out.println("* "+ i + "단 출력");
			for (int j = 1; j < 10; j++) {
				System.out.println(i + " X " + j + " = " + (j * i));
			}
		}
	}

}
