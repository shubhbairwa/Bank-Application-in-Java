package Bank_Account_App;

public class Checking extends Account{
//list properties for specific a checking account
	private int DebitCardNumber;
	private int DebitCardPin;
	//constructor to initialize checking account properties
	public Checking(String name,String sSN,double initDeposit) {
		
		super(name, sSN, initDeposit);
		
		accountNumber="2"+this.accountNumber;
		setDebitCard();
		setRate();
		
	}
	public void setRate() {
		this.rate=getBaseRate()*.15;
		
	}
	//list any method specific to checking account
private void setDebitCard() {
	this.DebitCardNumber=DebitCardNumber;
	this.DebitCardPin=DebitCardPin;
	
	this.DebitCardNumber=(int)(Math.random()*Math.pow(10, 12));
	this.DebitCardPin=(int)(Math.random()*Math.pow(10, 4));
}
	public void showInfo() {
		
		
		System.out.println("ACCOUNT TYPE:CHECKING ");
		super.showInfo();
		System.out.println("Your Debit Card Number: "+this.DebitCardNumber+"\nPin of Debit Crad Number: "+this.DebitCardPin);
		System.out.println("Rate of this account: "+rate+"%");
	}
}
