package chapter3.ch03;

public class VIPCustomer extends Customer {
	
	double salesRatio;
	private String agentID;
	

	public VIPCustomer() {
		
		super(0, "no-name");
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	
public VIPCustomer(int customerID, String customerName) {
		
		super(customerID, customerName);
		bonusRatio = 0.05;
		salesRatio = 0.1;
		customerGrade = "VIP";
	}
	
	public String getAgentID() {
		return agentID;
	}
	
	public void setAgentID(String agentID) {
		this.agentID = agentID;
	}

}
