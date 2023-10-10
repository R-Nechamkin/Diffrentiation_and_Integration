package integration;

public class Term<T> {
	private double coefficient = 1;
	private double exponent = 1;
	private T inner;
	
	/**
	 * @param coefficient
	 * @param exponent
	 */
	public Term(T inner, double coefficient, double exponent) {
		this.coefficient = coefficient;
		this.exponent = exponent;
		this.inner = inner;
	}


	public Term(T inner) {
		this(inner,1, 1);
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


	/**
	 * @return the inner
	 */
	public T getInner() {
		return inner;
	}


	/**
	 * @param inner the inner to set
	 */
	public void setInner(T inner) {
		this.inner = inner;
	}

	/*
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("inner");
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
