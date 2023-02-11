package org.BankInfo;

public class Bank extends AxisBank {
public void savingBank() {
	int s = 5000;
System.out.println("Saving Account Balance :"+s);

}
private void fixed() {
	System.out.println("Fixed Deposit Amount : 10000" );
}

public static void main(String[] args) {
	Bank b = new Bank();
	b.bankInfo();
	b.savingBank();
	b.fixed();
	b.deposit();
}
}
