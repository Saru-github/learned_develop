package exam04;

class Point implements Cloneable{ // 복제를 허용해주는 인터페이스

	private int xPos;
	private int yPos;
	
	Point(int xPos, int yPos){
		this.xPos = xPos;
		this.yPos = yPos;
		
	}
	
	public void showPosition() {
		System.out.printf("[%d, %d]\n" , xPos, yPos);
		
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
	
	
}
