package Bank_Account_App;

public abstract class Account implements IBaseRate {
//list common properties for checking and saving account
private	String name;
	private String sSN;  //social security number
	private double balance;
	int index=10000;
	protected String accountNumber;
	protected double rate;
	//constructor to set base properties and initialize the bank account
	public Account(String name,String sSN,double initDeposit) {
	this.name=name;
	this.sSN=sSN;
	balance=initDeposit;
	index++;
		//set account number
	this.accountNumber=setAccountNumber();
	
	
	
	}
	
	public abstract void setRate();
	private String setAccountNumber() {
String lastTwoNumber=sSN.substring(sSN.length()-2, sSN.length());
int uniqueID=index;
int randomNumber=(int)(Math.random()*Math.pow(10, 3)); //for 3 digit we did this if we want 4 digit we have to type 4 in second argument
return lastTwoNumber+uniqueID+randomNumber;
	}
	//list of common methods
	public void deposit(double amount) {
		balance=balance+amount;
		System.out.println("you are Depositing $"+amount);
		PrintBalance();
	}
	public void withdraw(double amount) {
		balance=balance-amount;
		System.out.println("you withdrawing $"+amount);
		PrintBalance();
	}
	public void transfer(String towhere,double amount) {
		balance=balance-amount;
		
		System.out.println("Transfering $:"+amount+" to " +towhere);
		PrintBalance();
	}
	public void PrintBalance() {
		System.out.println("your current Balance: $"+balance);
	}
	public void compopund() {
		double interest=balance*(rate/100);
		System.out.println("Your Interest on your Current Balance: $"+interest);
		balance=balance+interest;
	
	}
	
	public void showInfo() {
		System.out.println(
				"NAME: "+name+"\nACCOUNT NUMBER: "+accountNumber+"\nBALANCE: "+balance
				);
	}
}
