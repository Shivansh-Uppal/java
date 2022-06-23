import java.lang.*;
import java.io.*;
import java.awt.event.*;
import java.awt.*;

public class calc {
    static Frame f;
    static Button add,sub,mult,div,cl,bac,eq;
    static Button b0,b1,b2,b3,b4,b5,b6,b7,b8,b9;
    static TextField tf;
    public static void main(String[] args) {
        f=new Frame();
        f.setSize(500,500);

        add=new Button("add");
        sub=new Button("sub");
        mult=new Button("mult");
        div=new Button("div");
        cl=new Button("clr");
        bac=new Button("bac");
        eq=new Button("=");

        b0=new Button("b0");
        b1=new Button("b1");
        b2=new Button("b2");
        b3=new Button("b3");
        b4=new Button("b4");
        b5=new Button("b5");
        b6=new Button("b6");
        b7=new Button("b7");
        b8=new Button("b8");
        b9=new Button("b9");

        f.add(add);
        f.add(sub);
        f.add(mult);
        f.add(div);
        f.add(cl);
        f.add(bac);
        f.add(eq);

        f.add(b0);
        f.add(b1);
        f.add(b2);
        f.add(b3);
        f.add(b4);
        f.add(b5);
        f.add(b6);
        f.add(b7);
        f.add(b8);
        f.add(b9);

        eq.setBounds(400,400,50,50);
        add.setBounds(400,360,50,50);
        sub.setBounds(400,310,50,50);
        mult.setBounds(400,250,50,50);
        div.setBounds(400,190,50,50);



        f.setVisible(true);
        f.setLayout(null);
    }
}
