package exam14;

public class innerClassTest {

	public static void main(String[] args) {

		OuterClass outer1 = new OuterClass("First");
		OuterClass outer2 = new OuterClass("Second");
		
		// new OuterClass.InnerClass(); //error
		
		OuterClass.InnerClass inner1 = outer1.new InnerClass();
		OuterClass.InnerClass inner2 = outer1.new InnerClass();
		
		OuterClass.InnerClass inner3 = outer2.new InnerClass();
		OuterClass.InnerClass inner4 = outer2.new InnerClass();
		
		
		
		
		// 이너 클래스 사용이유 : 아우터 클래스가 사용될때만, 사용되는 종속적인 의미.
		
	}

}
