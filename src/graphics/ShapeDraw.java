package graphics;
import org.w3c.dom.css.Rect;

import java.awt.*;
import javax.swing.*;

public class ShapeDraw extends JFrame{

        private JFrame frame;
        private JPanel pane;

        public static void main(String[] args) {
            SwingUtilities.invokeLater(new Runnable() {
                public void run() {
                    new ShapeDraw().createAndShowGui();
                }
            });
        }

        public void createAndShowGui() {
            frame = new JFrame("Shapes");
            pane = new JPanel() {
                @Override
                protected void paintComponent(Graphics g) {
                    super.paintComponent(g);

                    //Board b = new Board();
                    g.drawRect(10, 10, 50, 50);
                    g.drawRect(20, 10, 50, 50);
                    //g.drawRect(10, 75, 100, 50);
                    //g.drawPolygon(new int[] {35, 10, 60}, new int[] {150, 200, 200}, 3);
                    g.dispose();
                }

                @Override
                public Dimension getPreferredSize() {
                    return new Dimension(300, 300);
                }
            };

            frame.add(pane);
            frame.pack();
            frame.setVisible(true);
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        }

}
