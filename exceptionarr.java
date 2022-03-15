import java.util.Scanner;

class ElementNotFoundException extends Exception
{
    public ElementNotFoundException(String s)
    {
        System.out.println(s);
    }
}

public class exceptionarr
{
    public static void main(String[] args)
    {
        int flag=1;
        try
        {
            Scanner s= new Scanner(System.in);
            int n;
            int a[]={1,2,3,4,5,6,7,8,9};
            System.out.print("Enter the number to search:");
            n=s.nextInt();
            s.close();

            for (int i:a)
            {
                if (i==n)
                {
                    flag--;
                    break;
                }
            }
            if (flag==1)
            {
                throw new ElementNotFoundException("ElementNotFoundException");
            }
        }

        catch(ElementNotFoundException e)
        {
            System.out.println("Exception Handled");
        }
    }
}

