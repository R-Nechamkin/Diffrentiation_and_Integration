package integration;

public class Term {
	private double coefficient = 1;
	private double exponent = 1;
	/**
	 * @param coefficient
	 * @param exponent
	 */
	public Term( double coefficient, double exponent) {
		this.coefficient = coefficient;
		this.exponent = exponent;
	}


	public Term() {
		this(1, 1);
	}
	
	/**
	 * @return the coefficient
	 */
	public double getCoefficient() {
		return coefficient;
	}
	/**
	 * @param coefficient the coefficient to set
	 */
	public void setCoefficient(double coefficient) {
		this.coefficient = coefficient;
	}
	/**
	 * @return the exponent
	 */
	public double getExponent() {
		return exponent;
	}
	/**
	 * @param exponent the exponent to set
	 */
	public void setExponent(double exponent) {
		this.exponent = exponent;
	}

	/*
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("x");
		if (exponent != 1) {
			sb.append("^" + exponent);
		}
		if (coefficient != 1) {
			sb.insert(0,coefficient);
		}
		return sb.toString();
	}
	*/
}
