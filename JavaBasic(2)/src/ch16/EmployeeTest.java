package ch16;

public class EmployeeTest {

	public static void main(String[] args) {
		
		Employee employeejung = new Employee();
		employeejung.setEmployeeName("����ȣ");
		
		// System.out.println(employeejung.serialNum); // �ܺο��� private ���� serialNum ���Ƽ�  ���� ���� ���°���.
		System.out.println(employeejung.getSerialNum()); // �׷��� �̷��� serialNum get���� ��� �;��� set ����. 
		
		Employee employeeKim = new Employee();
		employeeKim.setEmployeeName("������");
	
		
		System.out.println(employeejung.getEmployeeName() + "���� �����" + employeejung.getEmployeeId());
		System.out.println(employeeKim.getEmployeeName() + "���� �����" + employeeKim.getEmployeeId());
	}

}
