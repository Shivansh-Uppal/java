import java.awt.*;
import java.awt.event.*;
public class awt_bas2 extends Frame implements KeyListener,MouseListener {
    Label l;
    TextArea area;

    awt_bas2() {
        l = new Label();

        l.setBounds (20, 50, 100, 20);

        area = new TextArea();

        area.setBounds (20, 80, 300, 300);

        area.addKeyListener(this);
        add(l);
        add(area);

        addMouseListener(this);

        setSize (400, 400);
        setLayout (null);
        setVisible (true);
    }

    public void keyPressed (KeyEvent e) {
        l.setText ("Key Pressed");
    }

    public void keyReleased (KeyEvent e) {
        l.setText ("Key Released");
    }

    public void keyTyped (KeyEvent e) {
        l.setText ("Key Typed");
    }

    public void mouseClicked(MouseEvent e) {
        l.setText("Mouse Clicked");
    }
    public void mouseEntered(MouseEvent e) {
        l.setText("Mouse Entered");
    }
    public void mouseExited(MouseEvent e) {
        l.setText("Mouse Exited");
    }
    public void mousePressed(MouseEvent e) {
        l.setText("Mouse Pressed");
    }
    public void mouseReleased(MouseEvent e) {
        l.setText("Mouse Released");
    }
    public static void main(String[] args) {
        new awt_bas2();
    }
}
