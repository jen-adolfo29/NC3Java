/*problem 91: write a java program to create a base class BankAccount 
with methods deposit() and withdraw(). create two subclasses 
SavingsAccount and CheckingAccount. override the withdraw() 
 in each subclass to impose different withdrawal limits and fees.*/

package Problem_91;

// base class BankAccount
class BankAccount {
	private double balance; 
	
	// Constructor
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }
    
    // deposit() method
    	public void deposit(double amount) {
    		balance += amount;
    		System.out.println("Deposit: PHP " + amount);
    		displayBalance();
    }
    
	// withdraw() method
	public void withdraw(double amount) {
		System.out.println("Withdraw: PHP " + amount);
	}
	
	// Method to display the current balance
    public void displayBalance() {
        System.out.println("Current Balance: PHP " + balance);
    }
    
    public double getBalance() {
        return balance;
      }
}
	
//Subclass SavingsAccount
	class SavingsAccount extends BankAccount {
		private double withdrawalLimit;

	    // Constructor
	    public SavingsAccount(double initialBalance, double withdrawalLimit) {
	        super(initialBalance);
	        this.withdrawalLimit = withdrawalLimit;
	    }
	    // Override
	    public void withdraw(double amount) {
	        if (amount > withdrawalLimit) {
	            System.out.println("Insufficient amount.");
	        } else {
	            super.withdraw(amount);
	            System.out.println("Withdrawal done.");
	        }
	        displayBalance();
	    }
}
	
//Subclass CheckingAccount
	class CheckingAccount extends BankAccount {
		private double withdrawalFee;
	
		// Constructor
	    public CheckingAccount(double initialBalance, double withdrawalFee) {
	        super(initialBalance);
	        this.withdrawalFee = withdrawalFee;
	    }
	    
	    //override
	    public void withdraw(double amount) {
	        double totalAmount = amount + withdrawalFee;
	        if (totalAmount > getBalance()) {
	            System.out.println("Insufficient funds.");
	        } else {
	            super.withdraw(totalAmount);
	            System.out.println("Successful withdrawal with a charge of PHP " 
	            + withdrawalFee + ".");
	        }
	        displayBalance();
	    }
}

public class Main {
	public static void main(String[] args) 
	{
		// instances of SavingsAccount and CheckingAccount
        SavingsAccount savingsAccount = new SavingsAccount(5000.0, 500.0);
        CheckingAccount checkingAccount = new CheckingAccount(2000.0, 250.0);

        // Deposit and withdraw from SavingsAccount
        System.out.println("\nSavings Account:");
        savingsAccount.deposit(1500.0);
        savingsAccount.withdraw(900.0);

        // Deposit and withdraw from CheckingAccount
        System.out.println("\nChecking Account:");
        checkingAccount.deposit(1000.0);
        checkingAccount.withdraw(700.0);
	}
}