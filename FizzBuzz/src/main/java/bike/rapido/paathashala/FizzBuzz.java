package bike.rapido.paathashala;

import java.util.Scanner;

public class FizzBuzz {
	public static String calculateFizzBuzz(int number) {
		if(number < 0)
		{
			return "Invalid Input! Enter positive number.";
		}
		else if(number%3 == 0 && number%5 ==0)
		{
			return "FizzBuzz";
		}
		else if (number%3 ==0)
		{
			return "Fizz";
		}
		else if (number %5==0) {
			return "Buzz";
		}
		return "Null";
	}

	public static void main(String[] args)
	{
		Scanner scanner = new Scanner(System.in);
		int choice = 0;
		do{
			System.out.println("\n1.Enter a number for FizzBuzz\n2.Exit!\n");
			System.out.println("Enter the choice : ");
			choice = scanner.nextInt();
			switch (choice) {
				case 1 -> {
					System.out.println("Enter a number for calculating FizzBuzz");
					int number = scanner.nextInt();
					String receivedOutput = calculateFizzBuzz(number);
					System.out.format("Received output for %d is : %s",number,receivedOutput);
				}
				case 2 -> System.out.println("Please visit us again!!");
				default -> System.out.println("Enter a valid choice!!\nEither 1 or 2");
			}
		}while (choice!=2);
		scanner.close();
	}

}
