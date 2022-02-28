package exam05;

public class IntroGenericArray {

	public static void main(String[] args) {
		String[] stArr = {"Hi", "I'm so happy", "Java Generic Programming"};
		
		showArrayData(stArr);
	}
		
	public static <T> void showArrayData(T[] arr) {
		for(T e : arr) {
			System.out.println(e);
		}
		
		
	}

}
