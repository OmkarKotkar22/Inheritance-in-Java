/*2. Question:
 Create a class BankAccount with a method calculateInterest(). Create subclasses SavingsAccount (interest rate 5%) and CurrentAccount (interest rate 3%).
 Calculate interest for different account types and display it.
Explanation:
 This tests inheritance with customized implementations in child classes.
*/


import java.util.*;
public class Bank_Details
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Account Holder Name: ");
		String name = sc.next();

		System.out.println("Enter the Account Balance: ");
		double balance = sc.nextDouble();

		BankAccount ba = new BankAccount(name, balance);
		ba.display();
		ba.calculateInterest();
		SavingAccount sa = new SavingAccount(name, balance);
		sa.calculateInterest();
		CurrentAccount ca = new CurrentAccount(name, balance);
		ca.calculateInterest();
	}
}

class BankAccount
{
	String accountHolderName;
	double balance;
	BankAccount(String accountHolderName, double balance)
	{
		this.accountHolderName = accountHolderName;
		this.balance = balance;
	}

	void calculateInterest()
	{
		System.out.println("Interest calculation depends on account type.");
	}

	void display()
	{
		System.out.println("Account Holder Name: "+ accountHolderName);
		System.out.println("Account Balance: "+ balance);
	}
}

class SavingAccount extends BankAccount
{
	SavingAccount(String accountHolderName, double balance)
	{
		super(accountHolderName, balance);
	}
	void calculateInterest()
	{
		double interest = balance * 0.05;
		System.out.println("Saving Account with Interest: "+ interest);
	}
}

class CurrentAccount extends BankAccount
{
	CurrentAccount(String accountHolderName, double balance)
	{
		super(accountHolderName, balance);
	}
	void calculateInterest()
	{
		double interest = balance * 0.03;
		System.out.print("Current Account with Interest: "+ interest);
	}
}












