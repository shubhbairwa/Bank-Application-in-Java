package Bank_Account_App;

import java.util.LinkedList;
import java.util.List;

public class BankAccountApp {

	public static void main(String[] args) {
		List<Account>accounts =new LinkedList<Account>();
		
//read a CSV file and create new account based on that data
List<String[]> newAccountHolders=utilities.Csv.read("C:\\Users\\shubh\\OneDrive\\Desktop\\Bank Application\\NewBankAccounts.csv");
System.out.println("NEW ACCOUNTS:");		
for (String[] accountHolders : newAccountHolders) {
			
		
			
		
			
		
			String name=accountHolders[0];
			String SSN=accountHolders[1];                   //use these numbers because we have 4 thing is a new account name, ssn, account type and initial balance
			String account=accountHolders[2];
			double initDeposit=Double.parseDouble(accountHolders[3]);
			
			if(account.equals("Savings")) {
			accounts.add(new Saving(name, SSN, initDeposit));
			}
				else if(account.equals("Checking")){
					accounts.add(new Checking(name, SSN, initDeposit));
				}
				else {
					System.out.println("error");
			}
		}
		for(Account acc:accounts) {
System.out.println("\n*************");
acc.showInfo();
		}
	}

}
