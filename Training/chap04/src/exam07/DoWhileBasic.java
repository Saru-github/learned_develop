package exam07;

public class DoWhileBasic {

	public static void main(String[] args) {

		// 1~100의 합은 = ?

		int num = 1;
		int result = 0;

		do {
			// System.out.println("카운팅 값: " + num);
			result += num;
			// System.out.println("누적 값: "+result);
			num++;
		} while (num <= 100);

		System.out.println("1~100 까지의 합: " + result);

	}

}
