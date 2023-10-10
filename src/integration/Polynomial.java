package integration;

import java.util.ArrayList;
import java.util.List;

public class Polynomial extends Term{
	private List<Term> terms = new ArrayList<>();
	

	public Polynomial(List<Term> terms) {
		this(1,1,terms);
	}
	
	/**
	 * @param terms   an {@code ArrayList} of terms
	 * @param exponent a double holding an exponent of the entire polynomial
	 * @param coefficient
	 */
	public Polynomial(double coefficient, double exponent, List<Term> terms) {
		super(coefficient, exponent);
		if (terms == null)
			throw new IllegalArgumentException("Your terms argument is null");
		for (Term t: terms) {
			this.terms.add(t);
		}
	}
	
	public Polynomial() {
	}
	
	public void addTerm(Term t) {
		terms.add(t);
	}

	public List<Term> getTerms(){
		return new ArrayList<Term>(terms);
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(terms.get(0));
		for (int i = 1; i < terms.size(); i++) {
			if (terms.get(i).getCoefficient() < 0){
				sb.append(" - ");
			}
			else {
				sb.append(" + ");
			}
			sb.append("(" + terms.get(i) + ")");
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
