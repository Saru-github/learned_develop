package exam15;


public class LocalClassTest {

	public static void main(String[] args) {

		OuterClass outer = new OuterClass("First");
		
		Readable localClass = outer.createLocalClassInst(10);
		// 특정 메서드를 호출하여, 자료형의 인스턴스를 반환한다면 로컬 클래스가 정의 되어있는 것이며, 
		// 해당 인스턴스를 반환해 주는구나, 그 자료형에서는 어떤 메서드를 사용할 수 있꾸나 정도로 생각 하면 되겠다.
		
		localClass.read();
		
		// outer.createLocalClassInst(10); 를 하면 참조자료형  Readable 의 참조변수(주소)를 리턴해주고, read 메서드를 사용할 수 있구나.
	}

}
