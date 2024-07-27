package chapter2.ch11;

public class MakeReportTest {

	public static void main(String[] args) {

		makeReport builder = new makeReport();
		String report = builder.getReport();
		
		System.out.println(report);
		
	}

}
