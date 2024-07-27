package chapter2.ch16;

public class Employee {
	
	public static int serialNum = 1000;
	
	private int empoyeedId;
	private String empoyeeName;
	private String department;
	
	public Employee() {
		
		serialNum++;
		empoyeedId = serialNum;
	}
	
	
	public int getEmpoyeedId() {
		return empoyeedId;
	}
	public void setEmpoyeedId(int empoyeedId) {
		this.empoyeedId = empoyeedId;
	}
	public String getEmpoyeeName() {
		return empoyeeName;
	}
	public void setEmpoyeeName(String empoyeeName) {
		this.empoyeeName = empoyeeName;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	
	

}
