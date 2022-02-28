package exam04;

public class Overriding {

	public static void main(String[] args) {

		Speaker speaker = new Speaker();
		
		speaker.setVolumeRate(20);
		speaker.showCurrentState();
		System.out.println("\n\n==================");
		
		BaseEnSpeaker baseSpeaker = new BaseEnSpeaker();
		
		baseSpeaker.setVolumeRate(10);
		baseSpeaker.setBaseRate(5);
		baseSpeaker.showCurrentState();
		System.out.println("\n\n==================");
		
		Speaker speaker2 = new BaseEnSpeaker(); // 다형성 - 상속관계 에서 서로의 참조변수로 인스턴스화 가능
		
		speaker2.setVolumeRate(5);
		System.out.println(speaker2.getVolumeRate());
		
		// speaker2.setBaseRate(7); // error
		
		speaker2.showCurrentState();
		
		
		
	}

}
