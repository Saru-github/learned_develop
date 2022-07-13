package chapter3.ch10;

public class ManualCar extends Car{
	
	
	@Override
	public void drive() {
		System.out.println("사람이 운전을 합니다");
		System.out.println("사람이 방향을 바꿉니다");
		
	}

	@Override
	public void stop() {

		System.out.println("장애물 앞에서 사람이 브레이크로 멈춥니다.");
		
	}

	@Override
	public void wiper() {
		System.out.println("와이퍼를 조작합니다.");
		
	}
	
	

}
