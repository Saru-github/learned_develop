package exam05;

class Person{
	
	
}

public class UseWrapperClass {

	public static void main(String[] args) {

		Person person = new Person();
		showData(person);
		
		int num = 10;
		showData(num);
		
		Integer intInst = new Integer(10);
		
		showData(intInst);
		
	}
							//Object obj = new Integer(10);
	public static void showData(Object obj) {
		System.out.println(obj);
	}
}
