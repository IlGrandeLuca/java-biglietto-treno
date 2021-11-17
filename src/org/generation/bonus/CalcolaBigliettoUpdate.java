package org.generation.bonus;

import java.util.Scanner;

public class CalcolaBigliettoUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter your age: ");
		int age = in.nextInt();
		
		System.out.print("Enter travel distance in km: ");
		double distance = in.nextDouble();
		
		//Total price
		double ticketPrice = distance * 0.21;
		double discount = 0;
		
		//Discount check
		if (distance > 0 && (age >= 0 && age < 150)) {
			
			if (age < 18 && age >= 0) {
				
				discount = (ticketPrice / 100) * 20;
				ticketPrice -= discount;
				
			} else if (age >= 65 && age < 150) {
				
				discount = (ticketPrice / 100) * 40;
				ticketPrice -= discount;
				
			}
			
			System.out.println("Ticket price: " + String.format("%.2f", ticketPrice) + "€;");
			System.out.println("Discount: " + String.format("%.2f", discount) + "€;");
			
		} else {
			
			System.out.println("Error...");
			
		}
		
		// Close listener
		in.close();
	}

}
