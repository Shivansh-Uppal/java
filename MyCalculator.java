import java.util.Scanner;

interface AdvancedArithmetic{
      int divisor_sum(int n);
}

class MyCalculator implements AdvancedArithmetic {
    @Override
    public int divisor_sum(int n) {
        int sum=0,i=1;
        for(i=1;i<=n;i++){
            if(n%i==0)
            sum=sum+i;
        }
        return sum;
    }
    public static void main(String[] args) {
        MyCalculator m=new MyCalculator();
        int n,sum;
        System.out.println("Enter the integer whose divisor sum is needed");
        Scanner s=new Scanner(System.in);
        n=s.nextInt();
        sum=m.divisor_sum(n);
        System.out.println("The sum is "+sum);
        s.close();
    }
}
