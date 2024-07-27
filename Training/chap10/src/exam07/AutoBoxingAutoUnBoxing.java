package exam07;

public class AutoBoxingAutoUnBoxing {

	public static void main(String[] args) {

		String name = "홍길동"; // new String("홍길동");
		int num = 10;
		
		Integer iValue = 10; // AutoBoxing
		Double dValue = 3.14; // AutoBoxing
		
		iValue = iValue + 10;
		System.out.println(iValue);
		
	}

}
