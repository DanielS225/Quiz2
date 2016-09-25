package quiz2;

import java.util.Scanner;

public class Tuition {

	public static void main(String[] args) {
		
		Scanner scn = new Scanner(System.in);
		
		System.out.println("Program will calculate tuition after four years of college with\nannual compounded percent increases in annual tuition.");
		System.out.println("First year tuition ($)");
		double tuition = scn.nextDouble();//initial tuition rate
		double total = tuition;
		
		for (int x = 1; x <= 3; x++) {
			System.out.println("Rate increase no. " + x + " where rate is given in whole number percent");
			double pct = scn.nextDouble();//initial tuition rate
			tuition *= ((pct/100)+1);//not sure why power function is needed
			total += tuition;
		}
		
		System.out.printf("\nThe final total tuition is: %.2f", total);

		scn.close();
		
	}

}
