interface MotorBike{
       int speed=100;
       int time=10;
       void distance();
}

interface Cycle{
    int distance=100;
    int tperiod=100;
    void speed();
}

class TwoWheeler implements MotorBike,Cycle{
    float tdist,avgspeed;
    public void distance(){
         tdist=(speed*time)+distance;
         System.out.println("total distance: "+tdist);
    }

    public void speed(){
        avgspeed=(speed+(float)(distance/tperiod))/2;
        System.out.println("average speed: "+avgspeed);
    }
}

public class vehicle {
    public static void main(String []args) {
        TwoWheeler w=new TwoWheeler();
        w.distance();
        w.speed();
    }
}