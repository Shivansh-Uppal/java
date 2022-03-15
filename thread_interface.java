public class thread_interface implements Runnable {
    public void run()
    {
        System.out.println("The thread is running");
    }
    public static void main(String[] args) {
        Runnable r1 = new thread_interface();
        Thread th1 = new Thread(r1, "Thread t1");
        th1.start();
        String str = th1.getName();
        System.out.println(str);
    }
}

