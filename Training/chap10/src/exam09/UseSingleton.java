package exam09;

class CalendarExam{
	private static CalendarExam instance = new CalendarExam();
	
	CalendarExam(){}
	
	public static CalendarExam getInstance() {
		return instance;
	}
}


public class UseSingleton { // Singleton = 하나의 인스턴스를 생성하여 후에 생성되는 참조변수들이 메서드를 통해 하나의 인스턴스만을 바라봄.

	public static void main(String[] args) {
		CalendarExam calendar1 = CalendarExam.getInstance();
		CalendarExam calendar2 = CalendarExam.getInstance();

	}

}
