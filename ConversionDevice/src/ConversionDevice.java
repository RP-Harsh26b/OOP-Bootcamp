package ConversionDevice.src;

import java.util.Scanner;

import ConversionDevice.src.logic.Converter;

class ConversionDevice {
	public static void main(String[] args) {
		System.out.println("Welcome to Conversion Device!!");
		Scanner scanner = new Scanner(System.in);
		Integer inputChoice = 0;
		float inchesToBeConverted, convertedYards, yardsToBeConverted, convertedInches, convertedFeet,
				feetToBeConverted;
		do {
			System.out
					.println("\n1.Convert Feet to Inches\n2.Convert Yards to Feet\n3.Convert Inches to Yards\n4.Exit!");
			inputChoice = scanner.nextInt();

			switch (inputChoice) {
				case 1:
					System.out.println("Enter the number in feet : ");

					feetToBeConverted = scanner.nextFloat();
					convertedInches = Converter.convertFeetToInches(feetToBeConverted);

					System.out.println(feetToBeConverted + " feet in inches = " + convertedInches + " inches");
					break;

				case 2:
					System.out.println("Enter the number in yards : ");

					yardsToBeConverted = scanner.nextFloat();
					convertedFeet = Converter.convertYardsToFeet(yardsToBeConverted);

					System.out.println(yardsToBeConverted + " yards in feet = " + convertedFeet + " feet");
					break;

				case 3:
					System.out.println("Enter the number in inches : ");

					inchesToBeConverted = scanner.nextFloat();
					convertedYards = Converter.convertInchesToYard(inchesToBeConverted);

					System.out.println(inchesToBeConverted + " inches in yards = " + convertedYards + " yards");
					break;
				// case 4:
				// System.out.println("Enter the number in yards : ");

				// yardsToBeConverted = scanner.nextFloat();
				// convertedInches = Converter.convertFeetToInches(yardsToBeConverted);

				// System.out.println(yardsToBeConverted + " inches in yards = " +
				// convertedInches + " yards");
				// break;
				case 4:
					System.out.println("Thanks for using our services!");
					break;

				default:
					System.out.println("Please enter a valid choice");
			}
		} while (inputChoice != 4);
		scanner.close();
	}
}
