class hell extends Thread{
     public void run(){
         System.out.println("123");
     }
}

class hell2 implements Runnable{
    public void run(){
        System.out.println("123456");
    }
}

public class ex{
    public static void main(String args[]) {
        hell h=new hell();
        h.start();
        System.out.print("\nHello\n");
        hell2 h2=new hell2();
        Thread m=new Thread(h2);
        m.start();
    }
}