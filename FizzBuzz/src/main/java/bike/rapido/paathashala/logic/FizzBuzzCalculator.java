package bike.rapido.paathashala.logic;

public class FizzBuzzCalculator {
	public String calculateFizzBuzz(int number) {
		if (number < 0) {
			return "Invalid Input! Enter positive number.";
		} else if (number % 3 == 0) {
			return "Fizz";
		}
		return "Null";
	}
}