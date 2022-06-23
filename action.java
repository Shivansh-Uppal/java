import java.awt.*;
import java.awt.event.*;


public class action implements ActionListener{
    TextField tf; 
    static Frame f;
    action(){
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        tf=new TextField();
        tf.setBounds(10,60,400,20);
        Button b=new Button("click");
        b.setBounds(10,90,80,20);
        b.addActionListener(this);
        f.add(b);
        f.add(tf);
     }

     public void actionPerformed(ActionEvent ae){
         tf.setText("Hello");
     }
     public static void main(String[] args) {
         f=new Frame();
         action a=new action();
     }
}
