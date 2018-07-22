package client;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.MobilePaymentService;
import service.MobilePaymentServiceImpl;
import util.InvalidNumberException;
import util.NegativeNumberException;

public class MobileClient {
	static MobilePaymentService mp;
	static Scanner scan;
	static long mobile;
	static String pass;
	public MobileClient() {
		scan = new Scanner(System.in);
		mp = new MobilePaymentServiceImpl();
	}

	public static void main(String[] args) {
		MobileClient mc = new MobileClient();
		System.out.println("Welcome to Mobile Payment System");
		while(true)
		{
		 System.out.println("Please Login");
		 try {
			System.out.println("Enter Mobile Number");
			mobile=scan.nextLong();
			mc.checkmobilevalid(mobile);
			System.out.println("Enter Password");
			pass= scan.next();
			boolean valid=mp.checkvalidity(mobile, pass);
			if (valid) 
				mc.mobileclient(mobile);
              else
				System.err.println("Mobile number or password invalid.");
		    } 
		   catch (InputMismatchException e) {
			System.err.println("Mobile number can be of only numbers");
			
		  }
		 catch (InvalidNumberException e) {
				System.err.println(e.getMessage());

			  }
		 catch (NegativeNumberException e) {
				System.err.println(e.getMessage());

			  }
		 System.out.println("Login Failed!");
	 }
	}

	private void checkmobilevalid(long mobile) throws NegativeNumberException, InvalidNumberException {
		if(mobile<0)
			throw new NegativeNumberException("Mobile Number cannot be negative");
		else
		{   int count=0;
			while(mobile!=0)
			{
				mobile=mobile/10;
				count++;
			}
		if(count!=10)
		{
			throw new InvalidNumberException();
		}
	 }
	}

	private void mobileclient(long mobile) throws NegativeNumberException {
		System.out.println("Mobile Number : " + mobile);
		while (true) {
			System.out.println("1.View Payment Details");
			System.out.println("2.Make Payment");
			System.out.println("3.Exit");
			System.out.println("Enter Your choice");
			try {
				int choice = scan.nextInt();
		switch (choice) {
		case 1:
			mp.paymentdetails(mobile);
			break;
		case 2:
			System.out.println("Enter amount to be paid ");
			try {
				int amount = scan.nextInt();
				mp.makepayment(amount);
			} catch (InputMismatchException e) {
				System.err.println("Please enter numeric values");
				scan.nextLine();
			}
			break;
		case 3:
			System.out.println("Exiting...ThankYou");
			System.exit(0);
		default:
			System.err.println("Invalid Choice");
		}
	} catch (InputMismatchException e) {
		System.err.println("Please enter numbers only (1-3)");
		scan.nextLine();
	}
			catch(NegativeNumberException e)
			{
				System.err.println(e.getMessage());
			}
   }
 }
}


