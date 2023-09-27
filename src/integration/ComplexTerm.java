package integration;

import java.util.*;

/*This class holds @code{Term}s multiplied by each other. 
 * 
 */

public class ComplexTerm extends Term {
	private List<Term> terms = new ArrayList<>();
	
	public ComplexTerm(List<Term> terms) {
		this(1,1,terms);
	}
	
	public ComplexTerm(double coefficient, double exponent, List<Term> terms) {
		super(coefficient, exponent);
//		if (terms == null)
	//		throw new IllegalArgumentException("Your terms argument is null");
		for (Term t: terms) {
			this.terms.add(t);
		}
	}
	
	public ComplexTerm() {
		this(1,1,null);
	}

	public void addTerm(Term t) {
		terms.add(t);
	}
	
	public List<Term> getTerms(){
		return new ArrayList<Term>(terms);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(terms.get(0));
		for (int i = 1; i < terms.size(); i++) {
			sb.append(" * " + terms.get(i) + "");
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
