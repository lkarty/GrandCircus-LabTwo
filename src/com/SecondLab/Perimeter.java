package com.SecondLab;

import java.util.Scanner;

public class Perimeter {

	private static Scanner scnr;

	public static void main(String[] args) {
		scnr = new Scanner(System.in);
		double length; // Room length
		double width; // Room width
		double roomArea; // width * length
		double roomPerimeter; // width * length
		boolean stop = false; // should program run again?
		String decision; // user answer

		System.out.println("Welcome to Grand Circus Room Detail");

		while (stop == false) {

			System.out.print("Enter length: ");
			length = scnr.nextDouble();

			System.out.print("Enter width: ");
			width = scnr.nextDouble();

			// Calculate Area and Perimeter
			roomArea = length * width;
			roomPerimeter = (length * 2) + (width * 2);

			System.out.println("Room Area: " + roomArea);
			System.out.println("Room Perimeter: " + roomPerimeter);

			// necessary when going from a numeric type to String scan.nextLine()
			scnr.nextLine();

			// Check to see if user wants to run program again
			System.out.println("Continue? (Type y or n)");
			decision = scnr.nextLine();
			if (decision.equals("n")) {
				System.out.println("Goodbye");
				stop = true;
			}
		}

	}

}
