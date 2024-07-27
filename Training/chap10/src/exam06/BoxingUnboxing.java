package exam06;

public class BoxingUnboxing {

	public static void main(String[] args) {
		//int num = 10;
		
		Integer iValue = new Integer(10);	// Boxing
		Double dValue = new Double(3.14); 	// Boxing
		
		System.out.println(iValue.intValue());		// Unboxing
		System.out.println(dValue.doubleValue());	// Unboxing
		
		int num1 = iValue.intValue();
		double num2 = dValue.doubleValue();
		
		
		System.out.println(num1);
		System.out.println(num2);
		
		iValue = new Integer(iValue.intValue() + 10);
		
		System.out.println(iValue.intValue());
	}

}
