public class swap {
    static void sw(int x,int y){
        x=x+y; 
        y=x-y;
        x=x-y;
        System.out.println("number 1 is: "+x);
        System.out.println("number 2 is: "+y);
    }

    static int a=10,b=20;
    public static void main(String[] args){
        sw(a,b);
    }
}
