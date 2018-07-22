import java.util.Scanner;
import java.lang.Math;
public class NumberUtil
{
 private void product(int a,int b)
 {
  System.out.println("The product of "+a+" and "+b+" is :"+(a*b));
 }
 private void squareroot(double a)
 {
  double sr=Math.sqrt(a);
  System.out.println("The square root of "+a+" is "+sr);
 }
 public static void main(String[] args)
 {
  NumberUtil nu=new NumberUtil();
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter two numbers to find the product:");
  int num1=sc.nextInt();
  int num2=sc.nextInt();
  nu.product(num1,num2);
  System.out.println("Enter a number to find the square root");
  double num3=sc.nextDouble();
  nu.squareroot(num3);
 }
}
  