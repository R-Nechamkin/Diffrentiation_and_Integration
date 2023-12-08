package differentiation;

import java.util.List;

import terms.Monomial;
import terms.ComplexTerm;
import terms.Polynomial;
import terms.Term;

public class Differentiation {

	
	public static Term differentiate(Term t) throws CannotDifferentiateException{
		Term diff = null;
		if (t instanceof Monomial) {
			diff = powerRule((Monomial) t);
		}
		else if (t instanceof Polynomial) {
			diff = differentiate((Polynomial)t);
		}
		else if (t instanceof ComplexTerm) {
			diff = differentiate((ComplexTerm) t);
		}
		return diff;
	}
	
	public static Term differentiate (Polynomial t) throws CannotDifferentiateException{
		Polynomial diff = new Polynomial();
		List<Term> terms = t.getTerms();
		for (int i = 0; i < terms.size(); i++) {
			diff.addTerm(differentiate(terms.get(i)));
		}
		return diff;
	}
	
	public static Term differentiate (ComplexTerm t) throws CannotDifferentiateException {
		if (t.getTerms().size() == 2) {
			return productRule(t);
		}
		else {
			throw new CannotDifferentiateException(true);
		}
	}
	
	public static Monomial powerRule(Monomial t) {
		Monomial diff = new Monomial(t.getVariable());
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
	public static Term productRule(ComplexTerm t) throws CannotDifferentiateException{
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
