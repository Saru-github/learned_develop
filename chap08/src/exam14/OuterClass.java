package exam14;

class OuterClass {
	
	private String name;
	private int num;
	
	OuterClass(String name) {
		this.name = name;
		this.num = 0;
		new InnerClass();
	}

	public void whoAreYou() {
		num++;
		System.out.println(name + " OuterClass " + num);
		
	}
	
	class InnerClass{
		InnerClass() {
			whoAreYou();
			
		}
	}
	
}
