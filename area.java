import java.util.Scanner;

class overload{
      double area(double radius){
           return 3.14*radius*radius;
      }

      double area(double length, double breadth){
          return length*breadth;
      }

      double area(int length){
          return length*length;
      }

      double area(double side1,double side2,double side3){
          double temp=(side1+side2+side3)/2;
          double triarea=Math.sqrt(temp*(temp-side1)*(temp-side2)*(temp-side3));
          return triarea;
      }
}
public class area {
    public static void main(String args[]) {
        Scanner s=new Scanner(System.in);
        overload o=new overload();
        int choice;
        double s1,s2,s3,l,b,r;
        int len;

        System.out.println("Which geometric fiqure area you want: \n1.Circle\n2.Rectangle\n3.Square\n4.Triangle");
        choice=s.nextInt();

        switch (choice){
            case 1:
            System.out.println("Enter the radius: ");
            r=s.nextDouble();
            System.out.println(o.area(r));
            break;

            case 2:
            System.out.println("Enter the length: ");
            l=s.nextDouble();
            System.out.println("Enter the breadth: ");
            b=s.nextDouble();
            System.out.println(o.area(l,b));
            break;

            case 3:
            System.out.println("Enter the length: ");
            len=s.nextInt();
            System.out.println(o.area(len));
            break;

            case 4:
            System.out.println("Enter the side1: ");
            s1=s.nextDouble();
            System.out.println("Enter the side2: ");
            s2=s.nextDouble();
            System.out.println("Enter the side3: ");
            s3=s.nextDouble();
            System.out.println(o.area(s1,s2,s3));
            break;
        }

        s.close();
    }
}
