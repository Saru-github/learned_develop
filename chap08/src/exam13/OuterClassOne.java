package exam13;

class OuterClassOne {

	NestedClass nst;
	
	
	//생성자
	OuterClassOne() {
		nst = new NestedClass();
		nst.simpleMethod();
	}
	
	//메서드
	public void whoAreYou() {
		System.out.println("whoAreYou() 호출...");
		// simpleMethod(); // error
		nst.simpleMethod();
	}
	
	
	
	//Nested Class
	
	static class NestedClass{
		
		NestedClass() {
			simpleMethod();
			
		}
		
		public void simpleMethod() {
			System.out.println("NestedClass = > simpleMethod()");
		}
	}
	
}
