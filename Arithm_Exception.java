import java.util.Scanner;

public class Arithm_Exception {
    public static void main(String[] args)
    {
        try
        {
            int a,b;
            int div;
            Scanner s=new Scanner(System.in);
            System.out.println("Enter first number:");
            a=s.nextInt();
            System.out.println("Enter second number:");
            b=s.nextInt();
            div=a/b;
            s.close();
        }
        
        catch(ArithmeticException e)
        {
            System.out.println(e);
            System.out.println("Exception handled");
        }

        try{
            int x[]=new int[4];
            System.out.println(x[5]+x[4]);
        }

        catch(ArrayIndexOutOfBoundsException d){
            System.out.println(d);
            System.out.println("Exception handled");
        }

        finally
        {
            System.out.println("Success");
        }
    }
}
