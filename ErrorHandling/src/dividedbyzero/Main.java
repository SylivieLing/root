package dividedbyzero; 
public class Main { 
/** 
* @param args the command line arguments 
*/ 
	public static void main(String[] args) { 
		try {
			System.out.println(3/0); 
		} catch (ArithmeticException e) {
			// print the error message
			System.out.printf("Caught runtime exception = %s\n", e.toString());
		}
	}
}