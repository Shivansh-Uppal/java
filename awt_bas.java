import java.awt.*;
import java.awt.event.*;
public class awt_bas implements ActionListener{
    Label lb1,lb2;
    TextArea ta;
    Button b;
    Frame f;
    awt_bas(){
        f=new Frame();
        f.setSize(400, 400);
        lb1=new Label("Characters: ");
        lb1.setBounds(50,50,100,20);
        lb2=new Label("Words: ");
        lb2.setBounds(50,80,100,20);
        ta=new TextArea();
        ta.setBounds(50,110,300,200);
        b=new Button("click");
        b.setBounds(50,320, 80,30);
        b.addActionListener(this);
        f.add(lb1);f.add(lb2);f.add(ta);f.add(b);
        f.setLayout(null);
        f.setVisible(true);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==b){
        String text=ta.getText();
        lb1.setText("Characters: "+text.length());
        String words[]=text.split("\\s");
        lb2.setText("Words: "+words.length);
        }
    }
public static void main(String[] args) {
    new awt_bas();
   }
}
