package bike.rapido.paathashala;

import bike.rapido.paathashala.logic.FizzBuzzCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

public class FizzBuzzCalculatorTest {

	final int ARRAY_SIZE = 10;
	private FizzBuzzCalculator fizzBuzz;

	@Before
	public void setup() {
		fizzBuzz = new FizzBuzzCalculator();
	}

	@Test
	public void shouldReturnFizzFor27DividedBy3() {
		int number = 27;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Fizz", receivedOutput);
	}

	@Test
	public void shouldReturnNotValidForNegativeInput() {
		int number = -9;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Invalid Input! Enter positive number.", receivedOutput);
	}

	@Test
	public void shouldReturnBuzzFor20WhenDividedBy5() {
		int number = 20;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Buzz", receivedOutput);
	}

	@Test
	public void shouldReturnFizzBuzzFor15WhenDividedBy3And5() {
		int number = 15;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("FizzBuzz", receivedOutput);
	}

	@Test
	public void shouldReturnFizzBuzzFor0DivisibleByEither3Or5() {
		int number = 0;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("FizzBuzz", receivedOutput);
	}

	@Test
	public void shouldReturnEmptyStringIf19NotDivisibleByEither3Or5OrBoth() {
		int number = 19;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("", receivedOutput);
	}

	@Test
	public void shouldReturnFizzForNumbersDivisibleBy3() {
		int[] numbers = {3, 6, 9, 12, 18, 21, 24, 27, 33, 36};
		String[] receivedOutput = new String[ARRAY_SIZE];
		String[] expectedOutput = new String[ARRAY_SIZE];
		for (int index = 0; index < ARRAY_SIZE; ++index) {
			expectedOutput[index] = "Fizz";
		}

		for (int index = 0; index < ARRAY_SIZE; ++index) {
			receivedOutput[index] = fizzBuzz.calculateFizzBuzz(numbers[index]);
		}

		assertArrayEquals(expectedOutput, receivedOutput);
	}


//	@Test
//	public void shouldReturnInvalidInputForNonIntegerInput() {
//		String temp = "15";
//		int number = Integer.parseInt(temp);
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals(receivedOutput, "Invalid Input! Enter a non-zero integer value");
//	}
}