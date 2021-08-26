package ch01;

public class Customer {

	protected int customerID;
	protected String customerName;
	protected String customerGrade; // private은 그 class 안에서만 쓸 수 있거든, 근데 하위 클래스는 접근 해야하잖아? 상위 클래서에서는 외부 클래스 접근 안되지만, 하위는 가능한거임. protect로
	int bonusPoint;
	double bonusRatio;
	
	String agentID;
	double saleRatio;
	
	
	public int getCustomerID() {
		return customerID;
	}

	public void setCustomerID(int customerID) {
		this.customerID = customerID;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getCustomerGrade() {
		return customerGrade;
	}

	public void setCustomerGrade(String customerGrade) {
		this.customerGrade = customerGrade;
	}

	public Customer() 
	{
		customerGrade = "SILVER";
		bonusRatio = 0.01;
		
	}
	
	public int calcPrice(int price) {
		bonusPoint += price * bonusRatio;
		return price;
	}
	
	public String showCustomerInfo() {
		return customerName + "님의 등급은" + customerGrade + "이며, 보너스 포인트는" + bonusPoint + "입니다.";
	
	}
}




