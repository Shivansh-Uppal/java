import java.awt.*;
import java.awt.event.*;

class awt{
    static Frame f;
    static TextField tf,tf2,tf3;
    static Choice c1;
    static Choice c2;
    static Button b1,b2;
    public static void main(String[] args) {
        f=new Frame();
        f.setSize(500,500);
        f.setVisible(true);
        f.setLayout(null);

        tf=new TextField();
        tf.setBounds(125,125,40,30);
        f.add(tf);

        tf2=new TextField();
        tf2.setBounds(170,125,40,30);
        f.add(tf2);

        tf3=new TextField();
        tf3.setBounds(170,250,40,30);

        c1=new Choice();
        c1.add("X");
        c1.add("Y");
        f.add(c1);

        c2=new Choice();
        c2.add("CSE");
        c2.add("Any other");
        f.add(c2);

        b1=new Button("Save");
        b1.setBounds(300,130,30,30);

        b2=new Button("close");
        b2.setBounds(300,240,30,30);

        f.add(b1);
        f.add(b2);


    }
}