package exam08;

public class ForBasic {

	public static void main(String[] args) {

		int result = 0;

		for (int i = 1; i <= 100; i++) {
			// System.out.println("카운팅 값: "+i);
			result += i;
			// System.out.println("누적 값: "+result);
		}

		System.out.println("1~100 까지의 합: "+result);

	}

}
