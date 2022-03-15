import java.util.Scanner;

class call{
    int x,y;
    String a;
    Scanner s=new Scanner(System.in);
    call(){
        System.out.println("Enter values of x and y: ");
           x=s.nextInt();
           y=s.nextInt();
        System.out.println("Values of x and y are: "+x+" "+y);
    }

    call(int x,int y){
        System.out.println("Values of x and y are: "+x+" "+y);
    }
}

public class constructor extends call {
    public static void main(String [] args){
        call c=new call();
        call d=new call(30,40);
        System.out.println(c.x);
        System.out.println(d.x);
    }
}
