/**
 * Description
 *
 * @author Student Name
 * @since Date Started
 */
 
import java.util.Scanner;

public class CoinStar {

	public static void main(String[] args) {

		coins(); // the method to read info, calculate, print
	}
	
	// the method to read info, calculate, print
	public static void coins() {

    // ========== INSERT YOUR CODE HERE ==========

		System.out.println("How many pennies did you insert?");
		Scanner sc = new Scanner(System.in);
		int amount = sc.nextInt();

		//calculate dollar amount and multiply by .01 to convert to dollars
		double dollarAmt = amount * 0.01;
		final double PERCENT = 0.2;

		//calculate percent by dividing the 2 values and multiplying to get correct dollar value
		double processFee = (amount * PERCENT) / 100;
		double earnings = dollarAmt - processFee;

		System.out.println(
				"You have deposited $" + dollarAmt +
				"\nThe processing fee is: $" + processFee +
				"\nYou earned $" + earnings);
    
    
    
    
    // ===========================================            

	}
}







// =============== LAB SUMMARY ===============

/*
1. What was the hardest part of this lab?

Calculating to get the proper amounts displayed correctly


2. What will you always remember (never forget) from this exercise?

I need to take breaks to help solve problems

*/