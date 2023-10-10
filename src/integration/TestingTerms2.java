package integration;

public class TestingTerms2 {

	public static void main(String[] args) {
		Term<String> v1 = new Term<>("x",3,4);  //3x^4
		System.out.println(v1);
		
		Term<> v2 = new BasicTerm('y',1,9); //x^9
		System.out.println(v2);

	}

}
