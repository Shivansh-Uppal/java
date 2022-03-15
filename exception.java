class m{
    void method(){
        System.out.println(1/0);
    }
}

public class exception {
    public static void main(String args[]) {
        float c=1;
        int load=70;
        int sla=0;
        try{
            m e=new m();
            e.method();
            //int data=100/0;
            // load=load/sla; only one error casn be spotted at a time
        }
        catch(Exception e){
            System.out.println(e);
            //e.printStackTrace();
        }
}
}