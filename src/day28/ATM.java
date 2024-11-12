package day28;

import java.util.Scanner;

class InsufficientBalanceException extends RuntimeException {

	public InsufficientBalanceException(String msg) {
		super(msg);
	}

}
class Customer{
	private int balance;

	public Customer(int balance) {
		super();
		this.balance = balance;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	
}
public class ATM {
	public static void main(String[] args) {
		Scanner in =new Scanner(System.in);
	    System.out.println("Enter the balance of the customer:");
	    Customer c= new Customer(in.nextInt());
	    System.out.println("Enter the amount to be withdrawn from the atm");
	    int withdrawn=in.nextInt();
	    try {
	    if(withdrawn>c.getBalance()) {
	    	throw new InsufficientBalanceException("You don't have enough balance to make this transaction");
	    }
	    
	    else {
	    	c.setBalance((c.getBalance()-withdrawn));
	    	System.out.println("Please collect the amount at the bottom");
	    	System.out.println("Your balance is : "+c.getBalance());
	    }
	    }
	    catch(InsufficientBalanceException e) {
	    	System.out.println(e.getMessage());
	    }
	    finally {
	    	System.out.println("Thank you for using bank atm");
	    }

	}
}
