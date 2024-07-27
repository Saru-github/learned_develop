package exam12;

public class ClassPrinter {
						// Object obj = pos1;
	public static void print(Object obj) {
		String org = obj.toString();
		
		if(obj instanceof UpperCasePrintable) { // ~able 인터페이스중 자바 기본제공 인터페이스는 의미만 제공하는 인터페이스일 확률이 높다.
			org = org.toUpperCase();
		}
		
		System.out.println(org);
		
		
	}

}
