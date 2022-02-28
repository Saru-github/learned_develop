package exam04;

class Sum {
	int sum;

	Sum() {
		sum = 0;
	}

	public synchronized void addNum(int num) { 
		this.sum += num;
		
		
		// sychronized(this)
		// {
			//this.sum += num;
		// }
	}

	public int getNum() {
		return sum;
	}

}

class AdderThread extends Thread {
	
	int start, end;
	Sum sumInst;
	
	AdderThread(Sum sum, int start, int end){
		this.sumInst = sum;
		this.start = start;
		this.end = end;
	}

	@Override
	public void run() {
		for(int i = start; i <= end; i++) {
			sumInst.addNum(i);
		}
		
	}
	
}

public class ThreadHeapMultiAccess {
	
	

	public static void main(String[] args) {

		// 같은 heap 메모리를 사용중일때, 동기화가 필요
		
		
		Sum sum = new Sum();
		
		AdderThread at1 = new AdderThread(sum, 1, 5000);
		AdderThread at2 = new AdderThread(sum, 5001, 10000);
		
		at1.start();
		at2.start();
		
		
			try {
				at1.join();
				at2.join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		
		
		System.out.println("1 ~ 10000 까지의 합: " + sum.getNum());
		
	}
	

}
