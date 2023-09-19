package integration;

import java.util.ArrayList;

public class Polynomial extends Term{
	private ArrayList<Term> terms;
	
	
	
	/**
	 * @param terms   an {@code ArrayList} of terms
	 * @param exponent a double holding an exponent of the entire polynomial
	 * @param coefficient
	 */
	public Polynomial(ArrayList<Term> terms) {
		this.terms = terms;
	}
	
	public Polynomial(double coefficient, double exponent, ArrayList<Term> terms) {
		super(coefficient, exponent);
		this.terms = terms;
	}



	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(terms.get(0));
		for (int i = 1; i < terms.size(); i++) {
			sb.append(" + " + terms.get(i));
		}
		if (getExponent() != 1 || getCoefficient() != 1) {
			sb.insert(0,"(");
			sb.append(")");
			if (getCoefficient() != 1) {
				sb.insert(0, getCoefficient());
			}
			if (getExponent() != 1) {
				sb.append("^" + getExponent());
			}
		}

		return sb.toString();
	}
}
