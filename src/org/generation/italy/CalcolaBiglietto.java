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
		double ticketDiscounted;
		
		//Discount check
		if (age < 18) {
			
			discount = (ticketPrice / 100) * 20;
			ticketDiscounted = (ticketPrice - discount);
			System.out.println("Ticket price: " + String.format("%.2f", ticketDiscounted) + "€;");
			System.out.println("Discount: " + String.format("%.2f", discount) + "€;");
			
		} else if ((age >= 18) && (age < 65)) {
			
			discount = (ticketPrice / 100) * 0;
			System.out.println("Ticket price: " + String.format("%.2f", ticketPrice) + "€;");
			System.out.println("Discount: " + String.format("%.2f", discount) + "€;");
			
		} else {
			
			discount = (ticketPrice / 100) * 40;
			ticketDiscounted = (ticketPrice - discount);
			System.out.println("Ticket price: " + String.format("%.2f", ticketDiscounted) + "€;");
			System.out.println("Discount: " + String.format("%.2f", discount) + "€;");
			
		}
		
		// Close listener
		in.close();
	}

}
