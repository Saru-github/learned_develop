package exam04;

public class BaseEnSpeaker extends Speaker {
	
	private int baseRate;
	
	
	public void setBaseRate(int baseRate) {
		this.baseRate = baseRate;
	}

	public int getBaseRate() {
		return baseRate;
	}
	
	public void showCurrentState() { // 메서드 오버라이딩 (상속관계에서 반환형, 이름, 매개변수 모두 같을때)
		
		super.showCurrentState();
		System.out.println("베이스 크기: " + getBaseRate());
	}
}
