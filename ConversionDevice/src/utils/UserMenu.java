package ConversionDevice.src.utils;

import java.util.Scanner;

import ConversionDevice.src.logic.Conversion;

public class UserMenu {
	public static void printMenu() {

		System.out.println("Enter the distance in feets");

		Scanner scanner = new Scanner(System.in);
		Float feets = scanner.nextFloat();
		Float inches = Conversion.convertFeetToInches(feets);

		System.out.println(feets + " feet in inches = " + inches + " inches");
		scanner.close();
	}
}
