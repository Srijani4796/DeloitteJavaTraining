package com.del;

public class PrimeSquare {

	public static void main(String[] args) {
		for(int i=3;i<=30;i++)
		{
			if(i==2)
				System.out.print(Math.pow(i, 2)+ " ");
			else
			{
             boolean prime=true;
			 for(int j=3;j<i;j++)
			 {
				if(i%j==0)
				{
					prime=true;
					break;
			    }
		     }
			 System.out.print(Math.pow(i,2)+ " ");
	         }
		}
    }
}