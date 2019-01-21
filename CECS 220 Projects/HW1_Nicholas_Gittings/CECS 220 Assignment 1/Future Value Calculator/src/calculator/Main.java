package calculator;

//Importing java utilities
import java.util.*;

public class Main {
	
	//Function to calculate future value using parameters investment amount, interest rate, and years invested
	private static double Calculator(double investAmount, double interestRate, int year) {
		
		//Declaring function variables
		double interestValue, total;
		
		
		interestValue = 1 + interestRate;
		
		//Using math function pow to raise interest value to how many years invested
		interestValue = Math.pow(interestValue, year);
		
		//Total is equal to investment amount times the interest value
		total = investAmount * interestValue;
		return total;
	}

	public static void main(String[] args) {
		//Creates scanner object for user input
		Scanner scan = new Scanner(System.in);
		
		//Declaring variables
		double investAmount, interestRate, fiveyear_futureValue, tenyear_futureValue, twentyyear_futureValue;
		boolean Choosing;
		
		//Prints line asking for user input then scans for input
		System.out.println("Enter investment amount: ");
		investAmount = scan.nextDouble();
		
		//Prints line asking for user input then scans for input
		System.out.println("Enter intrest rate as a decimal: ");
		interestRate = scan.nextDouble();
		if(interestRate > .99) {
			Choosing = true;
			while(Choosing == true) {
			System.out.println("Re-Enter interest rate as a decimal");
			interestRate = scan.nextDouble();
			if(interestRate < 1) {
				Choosing = false;
			}
			}
		}
		
		//Closes scanner
		scan.close();
		
		//Uses Calculator function to determine future value amount in 5, 10, and 20 years
		fiveyear_futureValue = Calculator(investAmount, interestRate, 5);
		tenyear_futureValue = Calculator(investAmount, interestRate, 10);
		twentyyear_futureValue = Calculator(investAmount, interestRate, 20);
		
		//Prints out future value of investment and format to 2 decimal places
		System.out.println("5 Years: ");
		System.out.printf("$" + "%.2f\n", fiveyear_futureValue);
		
		System.out.println("10 Years: ");
		System.out.printf("$" + "%.2f\n", tenyear_futureValue);
		
		System.out.println("20 Years: ");
		System.out.printf("$" + "%.2f\n", twentyyear_futureValue);

	}

}
