package Inheritance;

public class CurrentAccount extends Account {
	private Double overDraftLimit;
	
	public CurrentAccount(String name, float age, long accNum, double balance,double overdraftLimit) {
		super(name, age, accNum, balance);
		this.overDraftLimit=overdraftLimit;
	}

	@Override
	public String toString() {
		
		return super.toString()+" CurrentAccount [overdraftLimit=" + overDraftLimit + "]";
	}

}
