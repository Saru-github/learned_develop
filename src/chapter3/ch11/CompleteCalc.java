package chapter3.ch11;

public class CompleteCalc extends Calculator {

	@Override
	public int times(int num1, int num2) {
		return num1 * num2;
	}

	@Override
	public int devide(int num1, int num2) {
		if ( num2 == 0) {
			return EROROR;
		}
		return num1 / num2;
	}

	
	
}
