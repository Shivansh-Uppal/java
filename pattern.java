import java.util.Scanner;

public class pattern {
    public static void main(String [] args) {
        Scanner s=new Scanner(System.in);
        int x,space;
        
        System.out.println("Enter number of rows needed: ");
        x=s.nextInt();

        space=x+3;

        for(int i=1;i<=x;i++){
            for(int k=space;k>=1;k--){
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.print("\n");
            space--;
        }

        s.close();
    }
}
