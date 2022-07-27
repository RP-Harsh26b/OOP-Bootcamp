package bike.rapido.paathashala;

import bike.rapido.paathashala.logic.FizzBuzzCalculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TestFizzBuzz {

	private FizzBuzzCalculator fizzBuzz;

	@Before
	public void Setup() {
		fizzBuzz = new FizzBuzzCalculator();
	}

	@Test
	public void shouldPrintFizzFor27DividedBy3() {
		int number = 27;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Fizz", receivedOutput);
	}

	@Test
	public void shouldPrintFizzFor0DividedBy3() {
		int number = 0;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Fizz", receivedOutput);
	}

	@Test
	public void shouldPrintNotValidForNegativeInput() {
		int number = -1;

		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);

		assertEquals("Invalid Input! Enter positive number.", receivedOutput);
	}


//	@Test
//	public void shouldPrintInvalidInputForNonIntegerInput()
//	{
//		String temp = "15";
//		int number = Integer.parseInt(temp);
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals(receivedOutput,"Invalid Input! Enter a non-zero integer value");
//	}
//
//	@Test
//	public void shouldPrintNullIfInputIs0()
//	{
//		int number = 0;
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals("Null",receivedOutput);
//	}
//	@Test
//	public void shouldPrintBuzzFor20DividedBy5()
//	{
//		int number = 20;
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals("Buzz",receivedOutput);
//	}
//
//	@Test
//	public void shouldPrintFizzBuzzFor15DividedBy3And5()
//	{
//		int number = 15;
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals("FizzBuzz",receivedOutput);
//	}
//
//	@Test
//	public void shouldPrintNullIf19NotDividedByEither3Or5OrBoth() {
//		int number = 19;
//
//		String receivedOutput = fizzBuzz.calculateFizzBuzz(number);
//
//		assertEquals("Null", receivedOutput);
//	}
}