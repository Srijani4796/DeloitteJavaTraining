import java.util.Scanner;

public class PrintStars {

	public static void main(String[] args) {
	   int i,j,k,rows,n;
	   Scanner sc =new Scanner(System.in);
	   System.out.println("Enter the number of rows");
	   rows=sc.nextInt();
	   n=rows+(rows/2);
	   for(i=0;i<n;i++)   
	   {
		   if(i<(rows/2))
		   {
		   for(j=0;j<n-i;j++)
		    System.out.print(" ");
		   for(k=0;k<=i;k++)
			 System.out.print("* ");
		   System.out.println();
		   }
		   else
		   {
			  for(j=0;j<=n-i-2;j++)
				  System.out.print(" ");
			  for(k=0;k<=2*(i+1);k=k+2)
				  System.out.print("* ");
			  System.out.println();
			 i++;
		   }
		   
	   }
	}
}
	


