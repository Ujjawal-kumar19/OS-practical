import java.io.*;/* Ujjawal Kumar*/

class arithmeticOperation extends Thread
{
  private int x,y;
  arithmeticOperation(int x,int y)
  {
    this.x=x;
    this.y=y;
  }
  public void run()
  { System.out.println("Thread A_O:: ARITHMETIC OPERATION START");
    System.out.println("Addition: "+ (x+y));
    System.out.println("Substraction: "+ (x-y));
    System.out.println("Multiplication: "+ (x*y));
    System.out.println("Division: "+ (x/y)); 
    System.out.println("End of A_O");   
  }
}

class TrignometricOperation extends Thread
{
  double to;
  TrignometricOperation(double to)
  {
    this.to=to;
  } 
  public void run()
  { System.out.println("Thread T_O:: TRIGNOMETRIC OPERATION START");
    double sinValue = Math.sin(to);
    System.out.println("sin(" + to + ") = " + sinValue);
    double cosValue = Math.cos(to);
    System.out.println("cos(" + to + ") = " + cosValue);
    double tanValue = Math.tan(to);
    System.out.println("tan(" + to + ") = " + tanValue);
    System.out.println("End of T_O");
  }
}

class area extends Thread
{
  private int radius,side,height,base;
  area(int radius,int side,int height, int base)
  {
    this.radius=radius;
    this.side=side;
    this.height=height;
    this.base=base;
  }
  public void run()
  { System.out.println("Thread Area:: Area calculation start");
    System.out.println("Area of circle :"+(radius*radius*3.14));
    System.out.println("Area of square :"+(side*side));
    System.out.println("Area of Tringle: "+((base*height)/2));
    System.out.println("End of Area");
  }
}

class Prime extends Thread
{
  int pr;
  Prime(int pr)
  {
    this.pr=pr; 
  }
  public void run()
  { System.out.println("Thread Prime :: Prime number check");
    boolean flag = false;
    for (int j = 2; j <= pr / 2; ++j) 
    {    // condition for nonprime number
      if (pr % j == 0) 
      {
        flag = true;
        break;
      }
    }
  if (!flag)
  {
    System.out.println(pr+ " is a prime number.");
  }
  else
    {
      System.out.println(pr+ " is not a prime number.");
    }
  System.out.println("End of Prime number check");
  }
}


class EvenOdd extends Thread
{
  private int eo;
  EvenOdd(int eo)
  {
    this.eo=eo;
  }
  public void run()
  {
    if(eo%2==0)
    {
      System.out.println("Entered number is even");
    }
    else
    {
      System.out.println("Entered number is odd");
    }
  }
}

public class osthread
{  public static void main(String[] args)
     {
       int x=0;
       int y=0;
       BufferedReader e=new BufferedReader(new InputStreamReader(System.in));
       try
       {   
           System.out.println("Enter Number: ");
           x=Integer.parseInt(e.readLine());
           System.out.println("Enter Number: ");
           y=Integer.parseInt(e.readLine());
           System.out.println("Enter the value for trignometric operation: ");
           double to=Double.parseDouble(e.readLine());
           System.out.println("Enter Number to find odd/ Even: ");
           int eo=Integer.parseInt(e.readLine());
           System.out.println("Enter Number to find its prime or not: ");
           int pr=Integer.parseInt(e.readLine());
           System.out.println("Enter The radius for circle area: ");
           int radius=Integer.parseInt(e.readLine());
           System.out.println("Enter The side for square area: ");
           int side=Integer.parseInt(e.readLine());
           System.out.println("Enter The height and base for triangle area: ");
           int height=Integer.parseInt(e.readLine());
           int base=Integer.parseInt(e.readLine());
           arithmeticOperation A=new arithmeticOperation(x, y);
           A.start();
           TrignometricOperation B=new TrignometricOperation(to);
           B.start();
           area Area=new area(radius,side,height,base);
           Area.start();
           Prime prime=new Prime(pr);
           prime.start();
           EvenOdd evenodd=new EvenOdd(eo);
           evenodd.start();            
       }catch(IOException io)
       {
           System.out.println(io.getMessage());
       }

     }
}
