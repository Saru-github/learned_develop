package exam09;

public class LoopBreak {

	public static void main(String[] args) {

		System.out.println("* 1 ~ 100 사이의 (양의) 짝수값을 출력.");

		for (int i = 1; i <= 100; i++) {
			if (i % 2 == 0) {
				System.out.print(i + " ");

			}
		}
		System.out.println("\n");
		System.out.println("* 1 ~ 100 사이의 (양의) 5의 배수이며 7의 배수인 첫 숫자를 출력하시오.");

		for (int i = 1; i <= 100; i++) {
			if ((i % 5 == 0) && (i % 7 == 0)) {
				System.out.println("* 1 ~ 100 사이의 (양의) 5의 배수이며 7의 배수인 첫 숫자: " + i);
				break;
			}
		}
		System.out.println("");
		System.out.println("countinue 문 사용....");
		int count = 0;
		
		for (int i = 1; i <= 100; i++) {
			if ((i % 5 != 0) || (i % 7 != 0)) {
				continue;

			} 
			count++;
			System.out.println(i);
			
		}
		System.out.println(count);
	}

}
