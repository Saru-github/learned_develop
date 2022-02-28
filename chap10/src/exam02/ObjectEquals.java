package exam02;

class IntNumber{
	int num;
	
	IntNumber(int num){
		this.num = num;
	}

	@Override
	public boolean equals(Object obj) {
		IntNumber intNum = (IntNumber)obj;
		
		if(this.num == intNum.num) {
			return true;
		} else {
			return false;
		}
	}
	
	
}

public class ObjectEquals {

	public static void main(String[] args) {
		
		IntNumber num1 = new IntNumber(10);
		IntNumber num2 = new IntNumber(20);
		IntNumber num3 = new IntNumber(10);
		
		if(num1.equals(num2)) { // if(num1 == num2)
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
			
		if (num1.equals(num3)) {
			System.out.println("같다");
		} else {
			System.out.println("다르다");
		}
		
	}

}
