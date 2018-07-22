import java.util.Scanner;
public class SumAtPrime
{
 private int getSumAtPrime(int a[])
 {
  int sum=0;
  for(int i=0;i<a.length;i++)
  {
   if(checkprime(i))
    sum=sum+a[i];
  }
  return sum;
 }
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
  SumAtPrime sp=new SumAtPrime();
  Scanner scan=new Scanner(System.in);
  System.out.println("Enter size of array");
  int size=scan.nextInt();
  int a[]=new int[size];
  System.out.println("Enter "+size+" array elements");
  for(int i=0;i<size;i++)
   a[i]=scan.nextInt();
  System.out.println("The sum of numbers at prime indexes is :"+sp.getSumAtPrime(a));
 }
}
 