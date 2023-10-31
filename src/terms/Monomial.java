package terms;

public class Monomial extends Term{
	private char variable;
	
	public Monomial (char variable) {
		this.variable = variable;
	}
	
	public Monomial (char variable, double coefficient, double exponent) {
		super(coefficient, exponent);
		this.variable = variable;
	}
	
	
	public char getVariable() {
		return variable;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(variable);
		if (getExponent() != 1) {
			sb.append(")^" + getExponent());
			sb.insert(0, "(");
		}
		if (getCoefficient() != 1) {
			sb.insert(0, getCoefficient());
		}
		return sb.toString();
	}
}