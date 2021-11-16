package org.generation.italy;

import java.util.Scanner;

public class CalcolaBiglietto {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		System.out.print("Enter travel distance in km: ");
		double distance = in.nextDouble();
		
		//Total price
		double ticketPrice = distance * 0.21;
		double discount;
		
		//Discount check
		if (age < 18) {
			
			discount = (ticketPrice / 100) * 20;
			double discountUnder = ticketPrice - discount;
			System.out.println("Ticket price: " + discountUnder + "€;");
			System.out.println("Discount: " + discountUnder + "€;");
			
		} else if ((age >= 18) && (age < 65)) {
			
			discount = (ticketPrice / 100) * 0;
			System.out.println("Ticket price: " + ticketPrice + "€;");
			System.out.println("Discount: " + discount + "€;");
			
		} else {
			
			discount = (ticketPrice / 100) * 40;
			double discountOver = ticketPrice - discount;
			System.out.println("Ticket price: " + discount + "€;");
			System.out.println("Discount: " + discountOver + "€;");
			
		}
		
		// Close listener
		in.close();
	}

}
