import java.util.Scanner;

public class prime {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.println("Enter till where primes are needed: ");
        n=sc.nextInt();
        
        if(n==0 || n==1){
            System.out.println("NOT PRIME");
        }
        
        System.out.println("The prime numbers are: ");
        
        for(int i=1;i<=n;i++){
            int count=0;
            for(int j=i;j>=1;j--){
             if(i%j==0){
                 count++;
             }
        }
          if(count==2){
            System.out.print(i+" ");
          }
        }
        sc.close();
    }    
}
