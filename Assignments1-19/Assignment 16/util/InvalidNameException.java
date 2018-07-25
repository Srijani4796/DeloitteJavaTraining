package com.del;

public class InvalidNameException extends Exception {
	private static String msg="Name should start with capital letters and should consist of only alphabets";

	public InvalidNameException()
	{
		super(msg);
	}

}
