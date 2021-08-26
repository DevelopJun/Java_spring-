package ch16;

public class Employee {

		private static int serialNum = 1000;
	
		private int employeeId;
		private String employeeName;
		private String department;
		
		public Employee() {
			
			serialNum++;
			employeeId = serialNum;
		}
			
		public static int getSerialNum() {
			int i = 0; // 지역변수는 상관 없다. 
			
			// employeeName = "Lee" //인스턴스 변수 이건 힘들다 일반 맴버 변수 사용하는게 Static 안에서 힘든거임. 지금. 
			
			return serialNum;
		}
		public int getEmployeeId() {
			// serialNum = 1000 ; // 이건 아무런 문제가 안되는거지 static 은 이미 메모리가 잡혀 있거든 
			return employeeId;
		}
		
		public void setEmployeeId(int employeeId) {
			this.employeeId = employeeId;
		}
		public String getEmployeeName() {
			return employeeName;
		}
		public void setEmployeeName(String employeeName) {
			this.employeeName = employeeName;
		}
		public String getDepartment() {
			return department;
		}
		public void setDepartment(String department) {
			this.department = department;
		}
		
		
		
}
