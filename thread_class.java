public class thread_class extends Thread {
    public void run(){
        for(int j=0;j<5;j++){
         System.out.println("Thread1 function");
     }
 }
    public static void main(String[] args) {
        thread_class t1=new thread_class();
        t1.start();
        for(int i=0;i<5;i++){
        System.out.println("Main function");
    }
}
}

