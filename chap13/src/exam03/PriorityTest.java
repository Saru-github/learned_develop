package exam03;

class MessageSendingThread extends Thread{
	
	String message;
	
	MessageSendingThread(String message, int prio) {
		this.message = message;
		setPriority(prio);
	}

	@Override
	public void run() {
		
		for(int i = 0; i < 1000; i++) {
		System.out.printf("%s(%d) \n", message, getPriority());
		
		try {
			sleep(1); // dummy
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		
		}
		
		
		
	}
	
}


public class PriorityTest {

	public static void main(String[] args) {
		
		MessageSendingThread tr1 = new MessageSendingThread("first", Thread.MAX_PRIORITY); // 우선순위, 1~10 사이의 값 기입가능
		MessageSendingThread tr2 = new MessageSendingThread("second", Thread.NORM_PRIORITY); // MAX = 10, NORM = 5, MIN = 1
		MessageSendingThread tr3 = new MessageSendingThread("third", Thread.MIN_PRIORITY);
		
		tr1.start(); 	// 우선순위가 높다고 높은것이 모두 끝나고 낮은 것이 실행되는 의미는아니다.
		tr2.start();	// 
		tr3.start();
		
		
	}

}
