import java.awt.event.*;
import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class action2 implements ActionListener,ItemListener, WindowListener {
    TextField tf;
    static Frame f;
    Choice c;
    Label l;
    action2(){
        f.setSize(500, 500);
        f.setVisible(true);
        f.setLayout(null);
        tf=new TextField();
        c=new Choice();
        l=new Label();
        tf.setBounds(70,60,400,20);
        l.setBounds(200,100, 100, 90);
        Button b=new Button("click");
        b.setBounds(10,90,80,20);
        b.addActionListener(this);
        c.add("1");
        c.add("2");
        c.add("3");
        c.setBounds(120, 100, 60, 20);
        c.addItemListener(this);
        f.add(c);
        f.add(b);
        f.add(tf);
        f.add(l);
        f.addWindowListener(this);
     }

     public void actionPerformed(ActionEvent ae){
        tf.setText("Hello");
    }

    public void itemStateChanged(ItemEvent i){
        if (c.getSelectedItem().equals("1"))
         l.setText("hi1");
         if (c.getSelectedItem().equals("2"))
         l.setText("hi2");
         if (c.getSelectedItem().equals("3"))
         l.setText("hi3");

    }

    public static void main(String[] args) {
        f=new Frame();
        action2 a=new action2();
    }

    @Override
    public void windowClosing(WindowEvent e) {
        f.dispose();
    }

    @Override
    public void windowOpened(WindowEvent e) {

    }

    @Override
    public void windowClosed(WindowEvent e) {
        System.out.println("closed");
    }

    @Override
    public void windowIconified(WindowEvent e) {

    }

    @Override
    public void windowDeiconified(WindowEvent e) {

    }

    @Override
    public void windowActivated(WindowEvent e) {

    }

    @Override
    public void windowDeactivated(WindowEvent e) {

    }

}
