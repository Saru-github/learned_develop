package chapter2.ch16;

public class EmployeeTest {

	public static void main(String[] args) {

		
		Employee employeeLee = new Employee();
		employeeLee.setEmpoyeeName("이순신");
		System.out.println(employeeLee.serialNum);
		
		Employee employeeKim = new Employee();
		employeeKim.setEmpoyeeName("김유신");
		
		System.out.println(employeeLee.getEmpoyeeName() + "님의 사번은" + employeeLee.getEmpoyeedId());
		System.out.println(employeeKim.getEmpoyeeName() + "님의 사번은" + employeeKim.getEmpoyeedId()); 
		
	}

}
