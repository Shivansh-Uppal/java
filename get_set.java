import java.util.Scanner;

class work{
    String p;

    Scanner s=new Scanner(System.in);

    String get(String n){
        return n; 
    }

    void set(String o){
        System.out.println("The setted name is: "+o);
    }
}

public class get_set extends work {
         static String n;
        public static void main(String [] args) {
                 work w=new work();
                 n=w.get("Shivansh Uppal");
                 w.set(n);
    }
}
