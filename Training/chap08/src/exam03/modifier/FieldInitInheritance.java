package exam03.modifier;

import exam03.protect.ParentClass;

class ChildClass extends ParentClass{

	public ChildClass(int n1, int n2, int n3, int n4) {
		super(n1, n2, n3, n4);
	}
	
	public void childMethod() {
		
		ParentMethod();
		
	//	System.out.println("num1 = " + num1);	// private 접근불가
	//	System.out.println("num2 = " + num2);	// default 접근불가
		System.out.println("num3 = " + num3);	// protected 상속관계에서 접근가능
		System.out.println("num4 = " + num4);	// public 접근가능
	}
	
}

public class FieldInitInheritance {

	public static void main(String[] args) {

		ChildClass child = new ChildClass(1, 2, 3, 4);
		
		child.childMethod();
	}

}
