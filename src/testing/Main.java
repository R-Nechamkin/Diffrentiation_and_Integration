package testing;

import java.util.ArrayList;
import java.util.List;

import differentiation.CannotDifferentiateException;
import differentiation.Differentiation;
import terms.*;

public class Main {

	public static void main(String[] args) {
		Term v1 = new Monomial('x',3,4);  //3x^4
		System.out.println(v1);
		
		Term v2 = new Monomial('y',1,9); //x^9
		System.out.println(v2);
		
		Term v3 = new Monomial('a', 3, 2);
		Term v4 = new Monomial ('x', 1.7, 2);
		
		List<Term> list1 = new ArrayList<>();
		list1.add(v1);
		list1.add(v2);
		
		Polynomial p1 = new Polynomial(list1);
		ComplexTerm cT1 = new ComplexTerm(list1);
		
		System.out.println("Polynomial: " + p1);
		System.out.println("Complex Term: " + cT1);
		
		cT1.addTerm(v3);
		p1.addTerm(cT1);
		System.out.println("Polynomial: " + p1);
		System.out.println("Complex Term: " + cT1);
		
		System.out.println(v4);
		try {
			System.out.println(Differentiation.differentiate(v4));
			System.out.println(Differentiation.differentiate(p1));
		} catch (CannotDifferentiateException e) {
			System.out.println(e.getMessage());
		}
	}

}
