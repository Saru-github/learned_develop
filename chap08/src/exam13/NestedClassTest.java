package exam13;

public class NestedClassTest {

	public static void main(String[] args) {

		OuterClassOne one = new OuterClassOne();
		OuterClassOne two = new OuterClassOne();
		
		one.whoAreYou();
		// one.simpleMethod(); // error
		one.nst.simpleMethod();
		
		
		OuterClassOne.NestedClass nst1 = new OuterClassOne.NestedClass();
		
		nst1.simpleMethod();
		
		// new OuterClassTwo.NestedClass(); private 으로 선언
		
	}

}
