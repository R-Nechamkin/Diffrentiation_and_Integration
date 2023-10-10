package terms;

import java.util.*;

/*This class holds @code{Term}s multiplied by each other. 
 * 
 */

public class ComplexTerm extends Term {
	private List<Term> inner = new ArrayList<>();
	
	public ComplexTerm(List<Term> terms) {
		this(1,1,terms);
	}
	
	public ComplexTerm(double coefficient, double exponent, List<Term> terms) {
		super(coefficient, exponent);
	if (terms == null)
			throw new IllegalArgumentException("Your terms argument is null");
		for (Term t: terms) {
			this.inner.add(t);
		}
	}
	
	public ComplexTerm() {
	}

	public void addTerm(Term t) {
		inner.add(t);
	}
	
	public List<Term> getInner() {
		return inner;
	}
	
	public List<Term> getTerms(){
		return new ArrayList<Term>(inner);
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(inner.get(0));
		for (int i = 1; i < inner.size(); i++) {
			sb.append(" * " + inner.get(i) + "");
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
