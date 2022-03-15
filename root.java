import java.util.Scanner;
import java.lang.Math;
public class root {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double a,b,c,dcm;

        System.out.println("Write the coefficients of equation ax^2+bx+c: ");
        a=sc.nextDouble();
        b=sc.nextDouble();
        c=sc.nextDouble();
        dcm=(Math.pow(b,2)-(4*a*c));
        System.out.println("The discriminant is: "+dcm);
        if(dcm<0){
            System.out.println("no real root");
        }

        else{
            System.out.println("The positive root is: ");
            System.out.println((-b+Math.sqrt(dcm))/(2*a));
            System.out.println("The negative root is: ");
            System.out.println((-b-Math.sqrt(dcm))/(2*a));
        }
        sc.close();
    }
}
