	package exam16;

interface Readable {
	public void read();
}

public class OuterClass {

	private String name;

	OuterClass(String name) {
		this.name = name;
	}

	public Readable createLocalClassInst(/*final*/ int num) { // 7버전이후 final 생략 되어있음.
		
		return new Readable() {

			@Override
			public void read() {
				System.out.println("LocalClass read(): " + name);
				System.out.println("num: " + num);
				
			}
			
		};
		
	}

}
