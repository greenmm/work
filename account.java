package ff;

public class account {
	public static void main(String args[]) {
		DepositAccount saver = new DepositAccount("1234567890","Zhang san",5000);//创建新用户
		DepositAccount.setInterest(0.023);  //设置年利率    
		saver.queryBalance();        //查询余额     
		saver.deposit(2000);         //存入2000元     
		System.out.println("年利息是：" + saver.calYearInterest());  
		}
		 }
		class DepositAccount {
		private String accountNum;     //账号
		private String name;           //储户姓名
		private double balance;        //存款余额，均为实例成员变量
		static double interest;        //年利率，类成员变量
		public static void setInterest(double d ) {  //设置年利率
		interest = d;
		}
		public DepositAccount(String num,String na,double ba) {  //开户，构造方法  
		accountNum = num;   
		name = na;   
		balance = ba;  
		}  
		public double calYearInterest() {  //计算年利息   
		return balance*interest;  
		}   
		public void deposit(double cash) {  //存款   
		System.out.println("您账户原有余额：" + balance);   
		System.out.println("您现在存入：" + cash);   
		balance += cash;   
		System.out.println("存款成功，您的余额是：" + balance);  
		}  
		public void queryBalance() {  //查询余额   
		System.out.println("您的余额是：" + balance);
		} 
}
