package exam12;
 
class NoAccessWay {

	static int num = 0;
	int memVari = 0;

	NoAccessWay() {

		incrementCnt();
	}

	public void incrementCnt() {

		memVari++; // 접근 가능
		num++; // 접근 가능

		noAccessWay();

	}

	public static void noAccessWay() {

		// memVari++; // 접근 불가능
		num++; // 접근 가능

		// incrementCnt(); // 호출 불가능
	}

}

public class ClassVarNoAccess {

	public static void main(String[] args) {

		NoAccessWay.num = 5;
		NoAccessWay.noAccessWay();
		
		NoAccessWay accessWay = new NoAccessWay();
		System.out.println("num: " + accessWay.num);
		
		accessWay.incrementCnt();
		System.out.println("num: " + accessWay.num);
		System.out.println("memVari: " + accessWay.memVari);
		
		accessWay.noAccessWay();
		System.out.println("num: " + accessWay.num);
		
		
		
		
	}

}
