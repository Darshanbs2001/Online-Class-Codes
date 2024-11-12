package day28;

public class ExampleForExceptionFinallyBlock {
	public static void main(String[] args) {

		try {
			
			System.out.println(10/2);
		}
		catch(ArithmeticException e) {
		System.out.println("Invalid denomination!");	
		}
		finally {
			System.out.println("finally block executed");
		}
		
	}
}
