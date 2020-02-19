import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends  JFrame implements KeyListener {

    @Override
    public void keyPressed(KeyEvent e) {
        System.out.println("keyPressed");
    }

    @Override
    public void keyReleased(KeyEvent e) {

    }

    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                MainFrame frame = new MainFrame();
                frame.setLayout(new GridLayout(5, 5));


                frame.setTitle("Square Move Practice");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {
        System.out.println("key");
    }

    @Override
    public void paint(Graphics g) {
        super.paint(g);
        g.drawRect(10, 10, 50, 50);
    }
}
