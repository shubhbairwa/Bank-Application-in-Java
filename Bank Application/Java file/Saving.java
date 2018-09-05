package Bank_Account_App;

public class Saving extends Account{
	//list properties to specific Saving Account
	private int SafetyDepositBoxID;
	private int safetyDepositBoxKey;
	//constructor to initialize setting for saving properties
public Saving(String name,String sSN,double initDeposit) {
	
	super(name, sSN, initDeposit);
	
	accountNumber="1"+this.accountNumber;
	setSafetyDepositBox();
	setRate();
		
	}
public void setRate() {
	this.rate=getBaseRate()-.25;
	
}

private void setSafetyDepositBox() {
	this.SafetyDepositBoxID=SafetyDepositBoxID;
	this.safetyDepositBoxKey=safetyDepositBoxKey;
	 this.SafetyDepositBoxID=(int)(Math.random()*Math.pow(10, 3));
	this.safetyDepositBoxKey=(int)(Math.random()*Math.pow(10, 4));
}
public void showInfo() {
	System.out.println("ACCOUNT TYPE: SAVING ");
	super.showInfo();
	System.out.println("Your Safety Deposit Box Id: "+SafetyDepositBoxID+"\nSafety Deposit Box Key: "+safetyDepositBoxKey);
	System.out.println("Rate of this account: "+rate+"%");
}
	
}

