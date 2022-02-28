package exam06;

class Box {
	public void simpleWrap() {
		System.out.println("simple wrap");
	}
}

class PaperBox extends Box {
	public void paperWrap() {
		System.out.println("paper wrap");
	}
}

class GoldPaperBox extends PaperBox {
	public void goldWrap() {
		System.out.println("gold wrap");
	}
}


public class InstanceOf {

	public static void main(String[] args) {
		
		Box box1 = new Box();
		PaperBox box2 = new PaperBox();
		GoldPaperBox box3 = new GoldPaperBox();
		
		wrapBox(box1);
		wrapBox(box2);
		wrapBox(box3);
		
	}
							// Box box = box1;
							// PaperBox box = box2;
							// GoldPaperBox box = box3;
	public static void wrapBox(Box box) {
		
		
		// 제일 자식 부터 해야 정확하게 산출 (box 가 먼저오면 모두 box로 인식)
		if(box instanceof GoldPaperBox) {
			GoldPaperBox wrap = (GoldPaperBox)box;
			
			wrap.simpleWrap();
			wrap.paperWrap();
			wrap.goldWrap();
			
			//((PaperBox) box).paperWrap();
		} else if (box instanceof PaperBox) {
			PaperBox wrap = (PaperBox)box;
			wrap.simpleWrap();
			wrap.paperWrap();
			
		} else {
			box.simpleWrap();
		}
		
		
	}
	
	
//							// PaperBox box = box2;
//	public static void wrapBox(PaperBox box) {
//		
//		box.simpleWrap();
//		box.paperWrap();
//	}
//							// GoldPaperBox box = box3;
//	public static void wrapBox(GoldPaperBox box) {
//		
//		box.simpleWrap();
//		box.paperWrap();
//		box.goldWrap();
//	}
}
