package com.del;

public class InvalidPhoneNumberException extends Exception {
	private static String msg="Phone number should be of 10 digits starting with"
			+ "7,8 or 9";

	public InvalidPhoneNumberException() {
		super(msg);
	}

}
