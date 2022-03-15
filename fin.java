class fintech{
    final int money=1000;

   final void bank(){
        System.out.println(money);
    }
}

final class run extends fintech{
    final double var;

    run(){
          bank();
          var=100.98;
      }

      final void method(){
         System.out.println(var+" :This is final");
      }
}

public class fin {
    public static void main(String args[]) {
        run r=new run();
        r.method();
    }
}
