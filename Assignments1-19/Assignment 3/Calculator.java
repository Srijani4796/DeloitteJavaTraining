import java.util.Scanner;

public class Calculator
{
  
  
  private int add(int m,int n)
  
  {
      return m+n;
  
  }

  private int sub(int m,int n)
  
  {
      return m-n;
 
  }
  
  private int mul(int m,int n)

  {
      return m*n;

  }
  
  private double div(int m,int n)

  {
      return m/n;

  }

  public static void main(String[] args)
  {

   System.out.println("Calculator:");

   Scanner scan=new Scanner (System.in);
     
   Calculator cal=new Calculator();
  
   System.out.println("Enter two numbers");
    
   int a=scan.nextInt();
   
   int b=scan.nextInt();

   System.out.println("Enter 1.Add 2.Sutract 3.Multiply 4.Divide");
     
   int ch=scan.nextInt();
         
   switch(ch)
 
   {
        
     case 1: System.out.println("The summation of "+a+" and "+b+" is "+cal.add(a,b));
 
               break;
       
     case 2: System.out.println("The subtraction of "+a+" and "+b+" is "+cal.sub(a,b));
 
               break;
        
     case 3: System.out.println("The multiplication of "+a+" and "+b+" is "+cal.mul(a,b));
 
               break;
  
     case 4: System.out.println("The divison of "+a+" and "+b+" is "+cal.div(a,b));
 
               break;
  
     default:
 System.out.println("Invalid Choice");
 
   }
     
  }

}