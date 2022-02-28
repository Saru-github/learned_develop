package exam02;

class ParentClass {
	int num1;

	ParentClass(int num) {
		this.num1 = num;
	}

}

class ChildClass extends ParentClass {

	ChildClass(int num) {
		super(num);
	}
}

public class DefaultSuper {

	public static void main(String[] args) {
		
		new ChildClass(5);

	}

}
