package exam07;

class A extends Object{
	A() {}
}

class B extends Object{
	
	public void method() {
		A a = new A();
		
		try {
			a.wait();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}

public class UseException {

	public static void main(String[] args) {

		
		
	}

}
