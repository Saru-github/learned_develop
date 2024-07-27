package exam05;

class Computer {
	
	Computer(){}
}

class NoteBook extends Computer {
	
	NoteBook(){}
}

class TabletPc extends NoteBook {
	TabletPc(){}
}


public class ReferenceVariableUse {

	public static void main(String[] args) {

		Computer cpt1 = new NoteBook();
		Computer cpt2 = new TabletPc();
		NoteBook cpt3 = new TabletPc();
		// TabletPc cpt4 = new NoteBook(); // error
		
		TabletPc cpt5 = new TabletPc();
		TabletPc cpt6 = cpt5;
		
		NoteBook cpt7 = cpt6;
		Computer cpt8 = cpt6;
		
		Computer cpt9 = new TabletPc();
		// NoteBook cpt10 = cpt9; // error
		// TabletPc cpt11 = cpt9; // error
		
		// 다형성 - Parent = new Child
		
	              	
	}

}
