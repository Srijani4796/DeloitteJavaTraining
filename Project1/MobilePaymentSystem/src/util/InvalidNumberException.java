package util;

public class InvalidNumberException extends Exception {

   private final static String MSG="Mobile number should be of 10 digits";
	public InvalidNumberException() {
		super(MSG);
	}

}
