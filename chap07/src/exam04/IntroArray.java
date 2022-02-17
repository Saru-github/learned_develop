package exam04;

public class IntroArray {

	public static void main(String[] args) {

		int korean = 90, english = 95, math = 85, social = 95, science = 90;

		System.out.println(korean);
		System.out.println(english);
		System.out.println(math);
		System.out.println(social);
		System.out.println(science);

		System.out.println("==============");

		int[] leesoonshin = new int[5];
		//int leesoonshin[] = new int[5];
		
		leesoonshin[0] = 90;
		leesoonshin[1] = 95;
		leesoonshin[2] = 85;
		leesoonshin[3] = 95;
		leesoonshin[4] = 90;

//		System.out.println(leesoonshin[0]);
//		System.out.println(leesoonshin[1]);
//		System.out.println(leesoonshin[2]);
//		System.out.println(leesoonshin[3]);
//		System.out.println(leesoonshin[4]);

		for (int i = 0; i < leesoonshin.length; i++) {
			System.out.println(leesoonshin[i]);
		}

		// 배열 선언 및 초기화
		int[] hongkildong = { 70, 65, 80, 90, 75 };
		System.out.println("==============");
		for (int i = 0; i < hongkildong.length; i++) {
			System.out.println(hongkildong[i]);
		}
	}

}
