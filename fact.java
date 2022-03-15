public class fact {
    static int factorial(int n){
        if(n==1 ||n==0){
            return 1;
        }
        
        else{
            return n*factorial(n-1);
        }
        
    }

    static int w=5;
    static int k;
    public static void main(String[] args){
        k=factorial(w);
        System.out.println("FACTORIAL IS : "+k);
    }
}
