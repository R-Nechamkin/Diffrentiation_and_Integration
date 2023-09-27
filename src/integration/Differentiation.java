package integration;

import java.util.List;

public class Differentiation {

	
	public static Term differentiate(Term t) {
		Term diff = null;
		if (t instanceof BasicTerm) {
			diff = powerRule((BasicTerm) t);
		}
		return diff;
	}
	
	public static Term differentiate (Polynomial t) {
		Polynomial diff = new Polynomial();
		List<Term> terms = t.getTerms();
		for (int i = 0; i < terms.size(); i++) {
			diff.addTerm(differentiate(terms.get(i)));
		}
		return diff;
	}
	
	public static Term differentiate (ComplexTerm t) {
		Term diff = null;
		if (t.getTerms().size() == 2) {
			diff = productRule(t);
		}
		return diff;
	}
	
	public static BasicTerm powerRule(BasicTerm t) {
		BasicTerm diff = new BasicTerm(t.getVariable());
		diff.setExponent(t.getExponent() - 1);
		diff.setCoefficient(t.getCoefficient() * t.getExponent());
		
		return diff;
	}
	
	/**
	 * product rule 
	 * Currently it only works for when there are 2 components
	 * @param t
	 * @return
	 */
	public static Term productRule(ComplexTerm t) {
		Polynomial diff = new Polynomial();
		List<Term> terms = t.getTerms();
		for (int i = 0; i < terms.size(); i++) {
			ComplexTerm part = new ComplexTerm();
			part.addTerm(differentiate(terms.get(i)));
			part.addTerm(terms.get(i+1));
			diff.addTerm(part);
		}
		return diff;
	}

}
