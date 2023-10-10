package terms;

import java.util.ArrayList;
import java.util.List;

public class Polynomial extends Term{
	private List<Term> inner = new ArrayList<>();
	

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
			this.inner.add(t);
		}
	}
	
	public Polynomial() {
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

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(inner.get(0));
		for (int i = 1; i < inner.size(); i++) {
			if (inner.get(i).getCoefficient() < 0){
				sb.append(" - ");
			}
			else {
				sb.append(" + ");
			}
			sb.append("(" + inner.get(i) + ")");
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
