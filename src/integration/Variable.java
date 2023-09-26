package integration;

public class Variable extends Term{
	private char letter;
	
	public Variable (char letter) {
		this.letter = letter;
	}
	
	public Variable (char letter, double coefficient, double exponent) {
		super(coefficient, exponent);
		this.letter = letter;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(letter);
		if (getExponent() != 1) {
			sb.append("^" + getExponent());
		}
		if (getCoefficient() != 1) {
			sb.insert(0, getCoefficient());
		}
		return sb.toString();
	}
}