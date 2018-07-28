package com.del;

import java.util.Scanner;

public class RomanNumbers {

	private static String NumbertoRoman(int num) {
	    String[] ones= {"","I","II","III","IV","V","VI","VII"
	    		,"VIII","IX"};
	    String[] tens= {"","X","XX","XXX","XL","L","LX","LXX",
	    		"LXXX","XC"};
	    String[] hundreds= {"","C","CC","CCC","CD","D","DC","DCC",
	    		"DCCC","DM"};
	    String[] thousands= {"","M","MM","MMM"};
	    String thou=thousands[num/1000];
	    String hund=hundreds[(num%1000)/100];
	    String ten=tens[(num%100)/10];
	    String one=ones[num%10];
	    return thou+hund+ten+one;
	    }
		


	public static void main(String[] args) {
		String roman="";
		int num;
		Scanner sc =new Scanner(System.in);
		do
		{
		  System.out.println("Enter numbers in the range 1-3000");
		  num=sc.nextInt();
		  if((num<1)||(num>3000))
		   continue;
		  else
		  {
			  roman =NumbertoRoman(num);
			  break;
          }
		}while(true);
		System.out.println("Equivalent Roman Number : "+roman);

 }

}
