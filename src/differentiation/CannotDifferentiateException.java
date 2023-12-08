package differentiation;


public class CannotDifferentiateException extends Exception {
	
	public CannotDifferentiateException() {
		this("This function is not differentiable");
	}
	
	public CannotDifferentiateException(String message){
		super(message);
	}
	
	public CannotDifferentiateException(boolean notSupported) {
		this("This program cannot differentiate your function. We, the programmers, apologize");
		
	}
}
