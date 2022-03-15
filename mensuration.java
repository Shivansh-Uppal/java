import java.util.Scanner;

public class mensuration {
    static Scanner obj=new Scanner(System.in);
    public static void main(String args[]) {
        System.out.println("enter the radius: ");
        double radius=obj.nextDouble();
        double area=3.14*radius*radius;
        double perimeter=2*3.14*radius;
        System.out.println("the area is: "+area);
        System.out.println("the perimeter is: "+perimeter);
    }
}
