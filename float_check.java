import java.util.Scanner;

public class float_check {
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        Float x,y;
        
        System.out.println("Enter 2 floating point numbers: ");
        x=s.nextFloat();
        y=s.nextFloat();
        
        if(Math.abs(x-y)<=0.001){
            System.out.println("Numbers are equal upto 3 decimal");
        }

        else{
            System.out.println("Numbers are not equal");
        }

        s.close();
    }
}
