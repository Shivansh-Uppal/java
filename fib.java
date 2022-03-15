import java.util.Scanner;

public class fib {
    public static void main(String args[]){
        Scanner obj=new Scanner(System.in);
        System.out.println("input a number: ");
        int n=obj.nextInt();

        int sum=1,a=0,b=1;
        System.out.print("0,1,");
        for(int i=0;i<n;i++){
            b=a+sum;
            a=sum;
            sum=b;
            System.out.print(""+b+",");
        }
        obj.close();
    }
}
