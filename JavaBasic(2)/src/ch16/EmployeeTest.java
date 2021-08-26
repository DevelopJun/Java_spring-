package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeejung = new Employee();
		employeejung.setEmployeeName("정준호");
		
		// System.out.println(employeejung.serialNum); // 외부에서 private 으로 serialNum 막아서  지금 오류 나는거임.
		System.out.println(employeejung.getSerialNum()); // 그래서 이렇게 serialNum get으로 들고 와야함 set 막음. 
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("김유신");
	
		
		System.out.println(employeejung.getEmployeeName() + "님의 사번은" + employeejung.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "님의 사번은" + employeeKim.getEmployeeId());
	}

}
