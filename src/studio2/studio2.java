package studio2;

import java.util.Scanner;

public class studio2 {
	public static void main (String[] args) {
	Scanner in =new Scanner(System.in);
	System.out.println("What is the amount starting with? ");
	double startAmount = in.nextDouble();
	System.out.println("The chance of wining is: ");
	double winChance = in.nextDouble();
	System.out.println("The win limit is: ");
	double winLimit = in.nextDouble();
	System.out.println("How many times are you going to play?");
	int totalSimulations= in.nextInt();
	for (int i = 1; i <= totalSimulations; i++ ) {
	while (startAmount < winLimit && startAmount>0.00) {
		double random = Math.random();
		if (random<=winChance) {
			startAmount ++;
		}
		else {
			startAmount --;
		}
	}
	
		System.out.println(i); 
		
		if (startAmount == 0.00) {
			System.out.println("Ruin");
			
			
			
		}
		if (startAmount == winLimit) {
			System.out.println("Sucess");
		}
		
		
		
		
		
		
	}
	}
	}
	
	
	
	



