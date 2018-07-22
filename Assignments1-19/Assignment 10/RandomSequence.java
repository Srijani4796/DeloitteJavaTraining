package com.del;

import java.util.Random;

public class RandomSequence {
	private static String randomsequence(String[] ar,String[] nou,String[] ver,String[] prep) {
		String sen;
		int ran=new Random().nextInt(4);
		sen=((ar[ran]).substring(0,1).toUpperCase());
		sen=sen+ar[ran].substring(1)+ " ";
		sen=sen+nou[new Random().nextInt(5)]+" ";
		sen=sen+ver[new Random().nextInt(5)]+" ";
		sen=sen+prep[new Random().nextInt(5)]+" ";
		sen=sen+ar[new Random().nextInt(4)]+" ";
		sen=sen+nou[new Random().nextInt(5)]+".";
		return sen;
	}
	public static void main(String[] args) {
		String[] article ={"the", "a",  "one", "some" };
		String[] noun ={"boy", "girl", "dog", "town", "car"};
		String[] verb ={"drove", "jumped", "ran", "walked", "skipped"};
		String[] preposition = {"to", "from", "over", "under", "on"};
		System.out.println("Random sequence sentence generator :");
		for(int i=1;i<=20;i++)
		{
			System.out.println(randomsequence(article,noun,verb,preposition));
		}

	}

}
