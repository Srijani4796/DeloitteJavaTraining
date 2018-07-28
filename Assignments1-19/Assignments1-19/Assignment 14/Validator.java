package com.del;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validator {
	private Pattern pattern;
	private static String regex1="^(\\d{3}-?\\d{2}-?\\d{4})$";
	private static String regex2="^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[#\\$%\\^&\\*])[A-Za-z0-9#$%^&*]{8,}$";
	private Matcher matcher;
	static Validator vd;
	public Validator(String regex) {
		pattern= Pattern.compile(regex);
	}
	private boolean validate(String id) {
		boolean valid=false;
		matcher=pattern.matcher(id);
		valid=matcher.matches();
		return valid;
	}

	public static void main(String[] args) {
		vd=new Validator(regex1);
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter ID :");
		String id=scan.next();
		boolean validid = vd.validate(id);
        if(validid)
        {
        	System.out.println("ID Valid");
        	System.out.println("Enter password");
        	do
        	{
        	String pass=scan.next();
        	vd=new Validator(regex2);
        	boolean validpass=vd.validate(pass);
        	if(validpass)
        	{
        		System.out.println("ID and password valid");
        		break;
            }
        	else 
        	{
        		System.err.println("Password not valid,Reenter");
        		continue;
        	}
        	}while(true);
	    }
        else
        	System.err.println("Sorry,ID not valid");
	}
	
}
