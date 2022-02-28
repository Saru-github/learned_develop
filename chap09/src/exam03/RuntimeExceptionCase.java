package exam03;

public class RuntimeExceptionCase {

	public static void main(String[] args) {

		try {
			int[] arr = new int[3];
			arr[-1] = 20;
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());

		}

		try {
			Object obj = new int[10];
			String str = (String) obj;
		} catch (ClassCastException e) {
			System.out.println(e.getMessage());
		}

		try {
			int[] arr = new int[-10];
		} catch (NegativeArraySizeException e) {
			System.out.println(e.getMessage());
		}


		try {
			String name = null;
			int length = name.length();
		} catch (NullPointerException e) {
			System.out.println(e.getMessage());
		}

		System.out.println("프로그램 종료...");
	}

}
