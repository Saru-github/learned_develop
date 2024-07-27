package exam08;

public class ForBasicTest {

	public static void main(String[] args) {
		int total = 0;

		System.out.println("=======for 문을 이용하여 작성=======");
		System.out.print("1~100 까지 2의배수이면서 5의배수인 숫자: ");
		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0 && i % 5 == 0) {
				System.out.print(+i + " ");
				total += i++;
			}
		}
		System.out.println("");
		System.out.println("1~100 까지의 2의배수이면서 5의배수인 숫자의 합: " + total + "\n");

		System.out.println("=======while 문을 이용하여 작성=======");
		total = 0;
		int num = 1;

		System.out.print("1~100 까지 2의배수이면서 5의배수인 숫자: ");

		while (num <= 100) {

			if (num % 2 == 0 && num % 5 == 0) {
				System.out.print(num + " ");
				total += num;
			}
			num++;
		}
		System.out.println("");
		System.out.println("1~100 까지의 2의배수이면서 5의배수인 숫자의 합: " + total + "\n");

		System.out.println("=======Do while 문을 이용하여 작성=======");
		

		total = 0;
		num = 1;

		System.out.print("1~100 까지 2의배수이면서 5의배수인 숫자: ");
		

		do {
			if (num % 2 == 0 && num % 5 == 0) {
				System.out.print(num + " ");
				total += num;
			}
			num++;
		} while (num <= 100);

		System.out.println("");
		System.out.println("1~100 까지의 2의배수이면서 5의배수인 숫자의 합: " + total);

	}

}
