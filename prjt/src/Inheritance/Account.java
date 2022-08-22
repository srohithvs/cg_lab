package Inheritance;

import java.util.Scanner;

public class Account {

		private long accNum;
		public double balance;
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

		public void deposit(double balance) {
			this.balance = this.balance + balance;
		}

		public void withdraw(double balance) {
			this.balance = this.balance - balance;
		}
		
		@Override
		public String toString() {
			return "Account [accNum=" + accNum + ", balance=" + balance + ", accHolder=" + accHolder + "]";
		}
	
		
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			
			long accNum = sc.nextLong();
			double balance = sc.nextDouble();
			String name = sc.next();
			float age = sc.nextFloat();
			//double overdraftLimit = sc.nextDouble();

			Account a = new Account(name, age, accNum, balance);
			//SavingAccount a1 = new SavingAccount(name, age, accNum, balance);
			//CurrentAccount a2 = new CurrentAccount(name, age, accNum, balance, overdraftLimit);
			
			a.deposit(4000);
			a.withdraw(2000);
			double b = a.getBalance();
			
			System.out.println("balance:"+ b);
			
			System.out.println(a);
			//System.out.println(a1);
			//System.out.println(a2);
			sc.close();
	}
}

