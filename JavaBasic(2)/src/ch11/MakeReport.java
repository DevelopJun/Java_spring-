package ch11;

public class MakeReport {

		StringBuffer buffer = new StringBuffer(); // �ֱٱ��� ���� ������ string 
		
		private String line = "===============================\n";
		private String title = " �̸�\t  �ּ� \t\t ��ȭ��ȣ \n";
		private void makeHeader()
		{
			buffer.append(line);
			buffer.append(title);
			buffer.append(line);
		}
		
		private void generateBody() 
		{
			buffer.append("james \t");
			buffer.append("Seoul Korea \t");
			buffer.append("010-2416-5159 \n");
			
			buffer.append("Tomas \t");
			buffer.append("NewYork Us \t");
			buffer.append("010-3042-1995 \n");
		}
		
		private void makeFooter()
		{
			buffer.append(line);
		}
		
		public String getReport() 
		{
			makeHeader();
			generateBody();
			makeFooter();
			return buffer.toString();
		}
}
