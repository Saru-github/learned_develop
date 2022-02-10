package exam06.cal;
 
public class Calculator {

	Adder adder;
	Subtractor subtractor;

	public Calculator() {

		adder = new Adder();
		subtractor = new Subtractor();

	}

	public int addTwoNumber(int num1, int num2) {
		int result = 0;
		result = adder.addTwoNumber(num1, num2);
		return result;

	}

	public int subTwoNumber(int num1, int num2) {
		int result = 0;
		result = subtractor.subTwoNumber(num1, num2);
		return result;

	}

	public int getCntAdd() {
		return adder.getCntAdd();
	}

	public int getCntSub() {
		return subtractor.getCntSub();
	}

	public void showOperationTimes() {
		System.out.println("=========================");
		System.out.println("덧셈 횟수: " + adder.getCntAdd());
		System.out.println("뺄셈 횟수: " + subtractor.getCntSub());
	}
	
}

class Adder {

	public int cntAdd;

	Adder() {
		cntAdd = 0;
	}

	int addTwoNumber(int n1, int n2) {
		cntAdd++;
		return n1 + n2;
	}

	int getCntAdd() {
		return cntAdd;
	}

}

class Subtractor {

	private int cntSub;

	Subtractor() {
		cntSub = 0;
	}

	int subTwoNumber(int n1, int n2) {
		cntSub++;
		return n1 - n2;
	}

	int getCntSub() {
		return cntSub;
	}
}
