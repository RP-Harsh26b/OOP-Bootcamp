package ConversionDevice.src.logic;

public class Converter {
	private static final Integer FEET_TO_INCH = 12;
	private static final Integer YARD_TO_FEET = 3;
	private static final float INCH_TO_FEET = (float) (1.0 / 12.0);
	private static final float FEET_TO_YARD = (float) (1.0 / 3.0);

	public static Float convertFeetToInches(Float feetToBeConverted) {
		return feetToBeConverted * FEET_TO_INCH;
	}

	public static Float convertYardsToFeet(Float yardsToBeConverted) {
		return yardsToBeConverted * YARD_TO_FEET;
	}

	public static float convertInchesToYard(float inchesToBeConverted) {
		return convertInchesToFeet(inchesToBeConverted) * FEET_TO_YARD;
	}

	private static float convertInchesToFeet(float inchesToBeConverted) {
		return inchesToBeConverted * INCH_TO_FEET;
	}
}
