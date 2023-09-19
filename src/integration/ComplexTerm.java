package integration;

import java.util.*;

public class ComplexTerm extends Term {
	private ArrayList<Polynomial> terms;
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append(terms.get(0));
		for (int i = 1; i < terms.size(); i++) {
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
