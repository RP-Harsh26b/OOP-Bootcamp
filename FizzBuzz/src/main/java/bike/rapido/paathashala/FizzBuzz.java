package bike.rapido.paathashala;

import bike.rapido.paathashala.logic.FizzBuzzCalculator;

import java.util.Scanner;

public class FizzBuzz {

	public static void main(String[] args) {
		int choice;
		FizzBuzzCalculator fizzBuzzCalculator = new FizzBuzzCalculator();
		System.out.println("Welcome to FizzBuzz!!");

		while (true) {
			System.out.print("\n1.Enter a number for FizzBuzz\n2.Exit!\n");
			System.out.print("Enter the choice : ");
			try {
				Scanner choiceInput = new Scanner(System.in);

				choice = choiceInput.nextInt();
				switch (choice) {
					case 1 -> {
						System.out.print("Enter a number for calculating FizzBuzz : ");
						Scanner scanner = new Scanner(System.in);
						try {
							int number = scanner.nextInt();
							String receivedOutput = fizzBuzzCalculator.calculateFizzBuzz(number);
							System.out.format("\n\t\tReceived output for %d is : %s \n", number, receivedOutput);
						} catch (Exception exception) {
							System.err.println("\n====Invalid Input====");
							System.err.println(exception);
							System.err.println("Please enter a Integer Value!!\n====================");
						}
					}
					case 2 -> {
						System.out.println("Please visit us again!!");
						System.exit(0);
					}
					default -> System.out.println("Enter a valid choice!!\nEither 1 or 2\n");
				}
			} catch (Exception exception) {
				System.err.println("====Invalid Choice Type====");
				System.err.println(exception);
				System.err.println("Please enter a Integer Value!!");
			}
		}
	}
}