import java.util.Scanner;

class details{

    Scanner s=new Scanner(System.in);

    int marks1,marks2,marks3;
    String roll_number,Name;

    String get_roll_number(){
        return this.roll_number;
    }

    String get_Name(){
        return this.Name;
    }

    int get_marks1(){
        return this.marks1;
    }

    int get_marks2(){
        return this.marks2;
    }

    int get_marks3(){
        return this.marks3;
    }

    void setdata(){
        System.out.println("Name of student is: ");
        Name=s.next();

        System.out.println("Roll number is: ");
        roll_number=s.next();

        System.out.println("Marks in maths: ");
        marks1=s.nextInt();

        System.out.println("Marks in java: ");
        marks2=s.nextInt();

        System.out.println("Marks in operating systems: ");
        marks3=s.nextInt();
    }

    void display(){
        System.out.println("   YOUR RESULT");
        System.out.println("Your name is: "+Name);
        System.out.println("Your roll number is: "+roll_number);
        System.out.println("Marks in maths: "+marks1);
        System.out.println("Marks in java: "+marks2);
        System.out.println("Marks in operating systems: "+marks3);
        System.out.println("\n");
    }

}
public class student {
    public static final int age = 0;
    public static final String name = null;

    public static void main(String [] args) {
          details [] d;
          d=new details[2];

          d[0]=new details();
          d[0].setdata();
          d[0].display();

          d[1]=new details();
          d[1].setdata();
          System.out.println("Name of student is: "+d[1].get_Name());
    }

    public int compareToIgnoreCase(String name2) {
        return 0;
    }

}

