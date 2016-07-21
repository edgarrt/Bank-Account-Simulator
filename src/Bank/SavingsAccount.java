package Bank;

public class SavingsAccount {

//private instance variable savingsBalance
	private static double savingsBalance;

//static class variable to store 
//the annualInterestRate for each of the savers
	static double annualInterestRate;
		
	SavingsAccount(double x, double y ){
		SavingsAccount.savingsBalance = x;
		SavingsAccount.annualInterestRate = y /12;
		
	}
	
	
	public void calculateMonthlyInterest(){
//Provide method calculateMonthlyInterest to calculate the monthly interest 
//by multiplying the balance by annualInterestRate divided by 12; 
//this interest should be added to savingsBalance. 
		double amountAdded = SavingsAccount.savingsBalance * SavingsAccount.annualInterestRate;
		

		System.out.println("For the first month, with a 4% interest rate and principal amount of $" + SavingsAccount.savingsBalance);
		
		SavingsAccount.savingsBalance = SavingsAccount.savingsBalance + amountAdded;
		
		System.out.println("The new total is: $"+ SavingsAccount.savingsBalance);
	}

	public static void modifyInterestRate(double x ){
//Provide a static method modifyInterestRate 
//that sets the annualInterestRate to a new value.
		double per = x * 100;
		
		SavingsAccount.annualInterestRate = x / 12;
		double amountAdded = savingsBalance * annualInterestRate;
		
		System.out.println("After modifying the interest rate to %" + per);
		System.out.println("For the next month and a new balance of $" + savingsBalance);
		
		savingsBalance = savingsBalance + amountAdded;
		
		System.out.println("The new total is $"+ savingsBalance);
		
	}
	
	public void withdrawMoney(double money ){
		if (money > savingsBalance ){
			System.out.print("Error!!\n");
			System.out.print("You are trying to withdraw more then you have available!!");
		}
		savingsBalance = savingsBalance - money;
		
		System.out.println("You Withdrew money. ");
		System.out.println("After withdrawing $" + money);
		System.out.println("The new balance is: $" + savingsBalance);
		System.out.println("");
		
		
	}
	
	public void depositMoney( double money){
		
		System.out.println("Thank you for Depositing Money.");
		System.out.println("Before depositing money you had a balance of $"+ savingsBalance);
		savingsBalance = savingsBalance + money;
		System.out.println("You Deposited a total amount of $" + money);
		
		if ( savingsBalance > 9999) {
			
			modifyInterestRate(.10 );
			System.out.println("");
			
		}
		else 
		{
			modifyInterestRate(.04);
			System.out.println("");
			
		}
	}
	

public static void main(String [] args){

		// Part 1 		

		System.out.println("Part 1");
		System.out.println("");
		
//      Saver 1	
		SavingsAccount saver1 = new SavingsAccount(2000, .04);
	
		System.out.println("Saver1:");
		saver1.calculateMonthlyInterest();
		SavingsAccount.modifyInterestRate(.05);
		
		System.out.println("");
		
//      Saver 2
		SavingsAccount saver2 = new SavingsAccount(3000, .04);
		
		System.out.println("Saver2:");
		saver2.calculateMonthlyInterest();
		SavingsAccount.modifyInterestRate(.05);
				
		System.out.println("");
		System.out.println("Part 2");
		System.out.println("");
		
		//Part 2
		
//  	Special Savings 
		SpecialSavings specialSaver1 = new SpecialSavings(2000.00,.04);
		
		System.out.println("SpecialSaver1:");
		specialSaver1.calculateMonthlyInterest();
		specialSaver1.depositMoney(4000);
		specialSaver1.withdrawMoney(2000);
		specialSaver1.depositMoney(5000);
		specialSaver1.withdrawMoney(9000);
		specialSaver1.depositMoney(5000);
		System.out.println("");
		System.out.println("");
		
		SpecialSavings specialSaver2 = new SpecialSavings(3000.00,.04);
		
		System.out.println("SpecialSaver2:");
		specialSaver2.calculateMonthlyInterest();
		specialSaver2.depositMoney(7000);
		specialSaver2.withdrawMoney(2000);
		specialSaver2.depositMoney(5000);
		specialSaver2.withdrawMoney(9000);
		specialSaver2.depositMoney(5000);
		
}
	
}
