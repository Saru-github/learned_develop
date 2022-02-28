package exam02;

class Sum {
	int sum;

	Sum() {
		sum = 0;
	}

	public void addNum(int num) {
		this.sum += num;
	}

	public int getNum() {
		return sum;
	}

}

class AddThread extends Sum implements Runnable {

	int start, end;

	AddThread(int s, int e) {

		this.start = s;
		this.end = e;

	}

	@Override
	public void run() {
		for(int i = start; i <= end; i++ ) {
			addNum(i);
		}
		

	}

}

public class RunnableThread {

	public static void main(String[] args) {

		AddThread at1 = new AddThread(1, 50);
		AddThread at2 = new AddThread(51, 100);

		Thread thread1 = new Thread(at1); // Runnable 인터페이스 상속후, main에서 객체에 원하는 클래스의 변수를 넣어준다.
		Thread thread2 = new Thread(at2); 
		
		thread1.start();
		thread2.start();
		
		try {
			thread1.join(); 					// thread1 이 실행 완료 될 때까지 지켜보며 대기
			thread2.join();						// thread2 이 실행 완료 될 때까지 지켜보며 대기
		} catch (InterruptedException e) {
		}
		
		System.out.println("1 ~ 100 까지의 총 합: " + (at1.getNum()+at2.getNum()));

	}

}
