package exam04;

public class IntroGenericMethod {

	public static void main(String[] args) {

		FatherClass father = new FatherClass();
		ChildClass child = new ChildClass();
		
		InstanceTypeShower shower = new InstanceTypeShower();
		
		//shower.<FatherClass>showInstType(father);
		shower.showInstType(father);
		
		shower.<ChildClass>showInstType(child);
				
		shower.showPrintCnt();
		
		shower.<FatherClass, ChildClass>showMultiInstType(father, child);
		
	}

}
