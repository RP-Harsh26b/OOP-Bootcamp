package ConversionDevice.src.logic;

public class Converter {
	private static final Integer FEET_TO_INCH = 12;
	private static final Integer YARD_TO_FEET = 3;

	public static Float convertFeetToInches(Float feetToBeConverted) {
		return feetToBeConverted * FEET_TO_INCH;
	}

	public static Float convertYardsToFeet(Float yardsToBeConverted) {
		return yardsToBeConverted * YARD_TO_FEET;
	}
}
