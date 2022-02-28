package exam13;

public class OuterClassTwo {
	NestedClass nst;
	
	OuterClassTwo() {
		NestedClass nst = new NestedClass();
		nst.simpleMethod();
	}
	
	private static class NestedClass{
		public void simpleMethod() {
			System.out.println("priva NestedClass -> simpleMethod() 호출....");
		}
	}
	
}
