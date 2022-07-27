package bike.rapido.paathashala;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

	private FizzBuzz fizzBuzz;

	@Before
	public void Setup()
	{
		fizzBuzz = new FizzBuzz();
	}

	@Test
	public void shouldPrintFizzFor9DividedBy3()
	{
		int number = 9;

		String receivedOutput = FizzBuzz.calculateFizzBuzz(number);

		assertEquals(receivedOutput,"Fizz");
	}

	@Test
	public void shouldPrintNotValidForNegativeInput()
	{
		int number = -1;

		String receivedOutput = FizzBuzz.calculateFizzBuzz(number);

		assertEquals(receivedOutput,"Invalid Input! Enter positive number.");
	}

	@Test
	public void shouldPrintBuzzFor20DividedBy5()
	{
		int number = 20;

		String receivedOutput = FizzBuzz.calculateFizzBuzz(number);

		assertEquals(receivedOutput,"Buzz");
	}

	@Test
	public void shouldPrintFizzBuzzFor15DividedBy3And5()
	{
		int number = 15;

		String receivedOutput = FizzBuzz.calculateFizzBuzz(number);

		assertEquals(receivedOutput,"FizzBuzz");
	}

	@Test
	public void shouldPrintNullIfNotDividedByEither3Or5OrBoth()
	{
		int number = 19;

		String receivedOutput = FizzBuzz.calculateFizzBuzz(number);

		assertEquals(receivedOutput,"Null");
	}
}
