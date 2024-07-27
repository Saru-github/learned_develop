package exam03.protect;

public class ParentClass {

	private int num1;
	int num2;
	protected int num3;
	public int num4;
	
	public ParentClass(int num1, int num2, int num3, int num4) {

		this.num1 = num1;
		this.num2 = num2;
		this.num3 = num3;
		this.num4 = num4;
	}
	
	public void ParentMethod() {
		System.out.println("num1 = "+num1);
		System.out.println("num2 = "+num2);
	}
	
	
}
