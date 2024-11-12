package day28;

class InvalidPasswordException extends RuntimeException {

	public InvalidPasswordException(String msg) {
		super(msg);
	}

}

public class LoginForm {
	public static void main(String[] args)  {

		String id="Admin";
		int password=1234;
		if(id.equals("Admin")) {
			if(password==12345) {
				System.out.println("Login successfull");
			}
			else {
				try {
				throw new InvalidPasswordException("The password is not correct");
				}
				catch(InvalidPasswordException e) {
					System.out.println(e.getMessage());
				}
			}
		}
		
	}
}
