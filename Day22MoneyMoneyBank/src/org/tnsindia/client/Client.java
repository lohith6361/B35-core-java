package org.tnsindia.client;

import org.tnsindia.application.MMBankingFactory;
import org.tnsindia.application.MMCurrentAcc;
import org.tnsindia.application.MMSavingAcc;
import org.tnsindia.framework.BankFactory;
import org.tnsindia.framework.CurrentAcc;
import org.tnsindia.framework.SavingAcc;

public class Client {

		public static void main(String args[])
		{
		
			BankFactory b =new MMBankingFactory();
			SavingAcc s= new MMSavingAcc(85639456,"Raju", 50000, true);
			CurrentAcc c = new MMCurrentAcc(856936547,"Jagu", 20000,10000);
			
			System.out.println("Saving Account");
			s.withdraw(s.getAccBal());
			
			System.out.println();
			
			System.out.println("Current Account");
			c.withdraw(c.getAccBal());
			
			System.out.println();
			
		    System.out.println(s);
		    System.out.println(c);
		    
		   
		}  
	}
