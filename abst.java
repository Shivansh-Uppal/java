abstract class bike{
     bike(){
         System.out.println("bike is fast");
     }

     void gear(){
        System.out.println("bike gear changed");
     }
}

class TwoWheeler extends bike{
     void run(){
        System.out.println("runs smoothly");
     }
}

public class abst {
    public static void main(String args[]) {
        bike b=new TwoWheeler();
        ((TwoWheeler) b).run();
        b.gear();
    }
}
