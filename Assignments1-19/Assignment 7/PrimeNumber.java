import java.util.Scanner;
public class PrimeNumber
{
 private boolean checkprime(int n)
 {
  int i;
  if(n<2)
   return false;
  for(i=2;i<n;i++)
  {
   if(n%i==0)
    return false;
  }
  return true;
 }
 public static void main(String[] args)
 {
  PrimeNumber pn=new PrimeNumber();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter a number to check prime");
  int num=scan.nextInt();
  boolean prime=false;
  prime=pn.checkprime(num);
  if(prime==true)
   System.out.println("It is a prime number");
  else
   System.out.println("It is not a prime number");
 }
}