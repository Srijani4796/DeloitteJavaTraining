package com.del;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmpObjectWriter {
	Pattern pattern1, pattern2;
	Matcher matcher;
	static String regex1 = "^([A-Z]([a-z]*))$";
	static String regex2 = "^([7-9]([0-9]{9}))$";
	static FileWriter fw;
	static BufferedWriter bw;

	public EmpObjectWriter() {
		pattern1 = Pattern.compile(regex1);
		pattern2 = Pattern.compile(regex2);
	}

	private void validateName(String id) throws InvalidNameException {
		matcher = pattern1.matcher(id);
		if (matcher.matches())
			return;
		else
			throw new InvalidNameException();
	}

	private void validateAge(int age) throws InvalidAgeException {
		if (age >= 18 && age <= 60)
			return;
		else
			throw new InvalidAgeException();
	}

	private void validatePhone(String phone) throws InvalidPhoneNumberException {
		matcher = pattern2.matcher(phone);
		if (matcher.matches())
			return;
		else
			throw new InvalidPhoneNumberException();
	}

	private void enterDetails(String id, String name, int age, String phone) {
		try {
			fw = new FileWriter("ObjectDetails.txt", true);
			bw = new BufferedWriter(fw);
			bw.write(id + ",");
			bw.write(name + ",");
			bw.write(age + ",");
			bw.write(phone);
			bw.newLine();
			System.out.println("Data stored in file");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		String id, name, phone;
		int age;
		Scanner scan = new Scanner(System.in);
		EmpObjectWriter emp = new EmpObjectWriter();
		while (true) {
			System.out.println("Enter ID");
			id = scan.next();
			System.out.println("Enter Name");
			name = scan.next();
			try {
				emp.validateName(name);
				System.out.println("Enter age");
				age = scan.nextInt();
				emp.validateAge(age);
				System.out.println("Enter phone");
				phone = scan.next();
				emp.validatePhone(phone);
				emp.enterDetails(id, name, age, phone);
			} catch (InvalidNameException e) {
				System.out.println(e.getMessage());
			} catch (InvalidAgeException e) {
				System.out.println(e.getMessage());
			} catch (InvalidPhoneNumberException e) {
				System.out.println(e.getMessage());
			}
			catch(InputMismatchException e) {
			   System.out.println("Age can only be an integer");
			   scan.next();
			}
			System.out.println("Do you want to continue?Enter Y");
			String proceed = scan.next();
			if (proceed.equalsIgnoreCase("Y"))
				continue;
			else
				break;

		}
		try {
			if(bw!=null && fw!=null)
			{
			 bw.close();
			 fw.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
