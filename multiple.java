interface maneat{
    void eat();
}

interface manhunt{
    void hunt();
}

class human implements maneat,manhunt {
          public void eat(){
              System.out.println("human eats");
          }

          public void hunt(){
            System.out.println("human hunts");
          }
}

public class multiple{
    public static void main(String []args) {
        human a=new human();
        a.eat();
        a.hunt();
    }
}