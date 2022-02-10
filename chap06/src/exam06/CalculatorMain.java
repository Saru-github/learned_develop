package exam06;

import exam06.cal.Calculator;
 
public class CalculatorMain {

	public static void main(String[] args) {

		Calculator calculator = new Calculator();
		calculator.addTwoNumber(100, 200);
		int result1 = calculator.addTwoNumber(33456, 549);
		System.out.println("33456 + 549 = " + result1);
		calculator.subTwoNumber(500, 100);
		calculator.subTwoNumber(600, 100);
		result1 = calculator.subTwoNumber(33456, 549);
		System.out.println("33456 - 549 = " + result1);
		calculator.showOperationTimes();
	}

}
