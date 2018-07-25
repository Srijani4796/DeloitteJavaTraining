package com.del;

public class InvalidAgeException extends Exception {
	private static String msg="Age should be 18-60";

	public InvalidAgeException() {
		super(msg);
	}

}
