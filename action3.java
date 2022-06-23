import java.awt.event.*;
import java.awt.*;

public class action3 implements ActionListener, ItemListener /* WindowListener*/ {
    Frame f;
    Label l;
    Button b;
    Choice c;
    TextField tf;
    TextArea ta;
    action3(){
          f=new Frame();
          f.setTitle("AWT");
          f.setSize(500,500);
          f.setVisible(true);
          f.setLayout(null);

          tf=new TextField();
          tf.setBounds(10, 100, 300, 30);
          tf.setText("TextField");
          f.add(tf);

          l=new Label();
          l.setBounds(10, 80, 300, 30);
          l.setText("Label");
          f.add(l);

          b=new Button();
          b.setBounds(10, 60, 300, 30);
          b.setName("Button");
          b.addActionListener(this);
          f.add(b);

          c=new Choice();
          c.setBounds(10, 30, 100, 30);
          c.setName("Checkbox");
          c.addItemListener(this);
          f.add(c);
    }

    public void actionPerformed(ActionEvent a){
          tf.setText("OK accepted!");
    }

    public void itemStateChanged(ItemEvent i){
        
    }

    public static void main(String[] args) {
        action3 n=new action3();
    }
}
