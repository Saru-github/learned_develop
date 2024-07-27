package exam07;
 
class Adder {

	public int add(int n1, int n2) {
		return n1 + n2;
	}

	public double add(double n1, double n2) { //자료형이 다름 - 오버로딩
		return n1 + n2;
	}

	public double add(int n1, double n2) {
		return n1 + n2;
	}

	public double add(double n1, int n2) {
		return n1 + n2;
	}

	public double add(double n1, int n2, int n3) { // 파라미터 갯수가 다름 - 오버로딩 
		return n1 + n2 + n3;
	}
	
//	public double add(int n1, int n2) { // 반환형이 다른것은 오버로딩에 영향을 미치지 않음.
//		return n1 + n2;
//	}

}

public class MethodOverloading {

	public static void main(String[] args) {

		Adder adder = new Adder();

		System.out.println("100 + 200 = " + adder.add(100, 200));
		System.out.println("3.14 + 5.45 = " + adder.add(3.14, 5.45));
		System.out.println("3.14 + 5 = " + adder.add(3.14, 5));
		System.out.println("3 + 5.45 = " + adder.add(3, 5.45));
		System.out.println("3 + 5 + 10 = " + adder.add(3, 5, 10)); // int형 파라미터 double 형으로 자동 형변환

	}

}
