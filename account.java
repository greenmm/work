package ff;

public class account {
	public static void main(String args[]) {
		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000);//�������û�
		DepositAccount.setInterest(0.023);  //����������    
		saver.queryBalance();        //��ѯ���     
		saver.deposit(2000);         //����2000Ԫ     
		System.out.println("����Ϣ�ǣ�" + saver.calYearInterest());  
		}
		 }
		class DepositAccount {
		private String accountNum;     //�˺�
		private String name;           //��������
		private double balance;        //�������Ϊʵ����Ա����
		static double interest;        //�����ʣ����Ա����
		public static void setInterest(double d ) {  //����������
		interest = d;
		}
		public DepositAccount(String num,String na,double ba) {  //���������췽��  
		accountNum = num;   
		name = na;   
		balance = ba;  
		}  
		public double calYearInterest() {  //��������Ϣ   
		return balance*interest;  
		}   
		public void deposit(double cash) {  //���   
		System.out.println("���˻�ԭ����" + balance);   
		System.out.println("�����ڴ��룺" + cash);   
		balance += cash;   
		System.out.println("���ɹ�����������ǣ�" + balance);  
		}  
		public void queryBalance() {  //��ѯ���   
		System.out.println("��������ǣ�" + balance);
		} 
}
