interface run{
    public void play();
    int speed=100;
}

class face implements run{
    int avg;
    face(){
        avg=speed;
    }
    public void play(){
            System.out.println("play fast at speed: "+avg);
    }
}
public class inter {
    public static void main(String args[]) {
    face f=new face();
    f.play();
}
}