package Inheritance;

import java.util.Scanner;

public class Account {

		private long accNum;
		private double balance;
		private Person accHolder;
		
		public Account(String name,float age,long accNum,double balance)
		{
			this.accNum=accNum;
			this.balance=balance;
			Person p = new Person(name,age);
			accHolder = p;
		}
		
		public long getAccNum() {
			return accNum;
		}
		public void setAccNum(long accNum) {
			this.accNum = accNum;
		}
		public double getBalance() {
			return balance;
		}
		public void setBalance(double balance) {
			this.balance = balance;
		}
		
		public void deposit(double bal)
		{
			this.balance += bal;
		}
		public void withdraw(double bal)
		{
			if((this.balance-bal)<500)
				System.out.println("Sorry, Minimun balance should be INR 500");
			else
				this.balance -= bal;
		}

		@Override
		public String toString() {
			return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}
		
		

		public void setAccHolder(Person accHolder) {
			this.accHolder = accHolder;
		}

		public void deposite(Double balance) {
			Double b=this.getBalance()+balance;
			balance=b;
		}

		public void withdraw(Double balance) {
			Double b=this.getBalance()-balance;
			balance=b;
		}
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			long accNum = sc.nextLong();
			double balance = sc.nextDouble();
			String name = sc.next();
			float age = sc.nextFloat();
			double overdraftLimit = sc.nextDouble();

			Account a = new Account(name, age, accNum, balance);
			SavingAccount a1 = new SavingAccount(name, age, accNum, balance);
			CurrentAccount a2 = new CurrentAccount(name, age, accNum, balance, overdraftLimit);
			
			System.out.println(a);
			System.out.println(a1);
			System.out.println(a2);
			sc.close();
	}
}

