import java.util.Scanner;

public class largest3 {
    public static void main(String[] args) {
         int x,y,z;
         
            Scanner sc = new Scanner(System.in); 
            System.out.println("enter number 1: ");
             x=sc.nextInt();
             
             System.out.println("enter number 2: ");
             y=sc.nextInt();
             
             System.out.println("enter number 3: ");
             z=sc.nextInt();
        

         if(x>y && x>z){
         System.out.print("largest is: ");
         System.out.println(+x);
         }

         else if(y>x && y>z){
             System.out.println("largest is: "+y);
         }

         else{
            System.out.println("largest is: "+z);
         }
        
         sc.close();
    }
}
