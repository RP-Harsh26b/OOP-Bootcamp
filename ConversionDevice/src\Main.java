package ConversionDevice;

import java.util.Scanner;

import ConversionDevice.logic.Conversion;

class Main {
	public static void main(String[] args) {
		System.out.println("Conversion Device!!");
		System.out.println("Enter the distance in feets");
		Scanner scanner = new Scanner(System.in);
		Float feets = scanner.nextFloat();
		Float inches = Conversion.convertFeetToInches(feets);
		System.out.println(feets + " in inches = " + inches);
		scanner.close();
	}
}
