

import com.ibm.bank.AccountFactory;
import com.ibm.bank.BalanceException;
import com.ibm.bank.Banking;
import com.ibm.bank.Current;
import com.ibm.bank.Savings;
import com.ibm.bank.Transaction;


public class TestAccount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * Account a1=new Account(); 
		 * a1.summary(); 
		 * Account a2=new
		 * Account("Darshan",100000); 
		 * a2.deposite(100); 
		 * a2.withdraw(500); 
		 * a2.summary();
		 * a2.deposite(400); 
		 * a2.withdraw(100001); 
		 * a2.summary();
		 * the class is abstract now so commented
		 */
			
			Savings s1=new Savings("Sona");
		
			try {
				s1.withdraw(5);
			
			
			Current c1=new Current("RK");
			c1.showDetails();
			c1.withdraw(3000);
			c1.showDetails();
			c1.withdraw(7000);
			c1.showDetails();
			c1.deposite(2000);
			c1.showDetails();
			c1.deposite(4000);
			c1.showDetails();
			c1.withdraw(12000);
			System.out.println();
			
			//from Transaction class
			Transaction t1= new Transaction("debited",10000,50000);
			t1.print();
			System.out.println();
			
			//new code part
			Banking ss=new Savings("Polo");
			ss.deposite(3000);
			ss.withdraw(2000);
			ss.deposite(4000);
			
			ss.statement();
			
			//using Design patterns
			Banking se=AccountFactory.openSavingsAccount("POLO");
			se.deposite(3000);
			se.withdraw(2000);
			se.deposite(4000);
			
			se.statement();
			}//try block over
			catch (BalanceException e) {
				// TODO Auto-generated catch block
			//	e.printStackTrace();// for debugging/troubleshooting -USer:Developers
		//	System.out.println(e);// for system/application audit-User:Loggers
			System.out.println(e.getMessage());//for end users
			}
			
	}
	

}
