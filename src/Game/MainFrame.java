import world.*;
import world.Character;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MainFrame extends  JFrame implements KeyListener {

    int posX = 0;
    int posY = 0;
    static WorldMap world;

    MainFrame(){
        addKeyListener(this);
        int timerDelay = 10;
        new Timer(timerDelay, new ActionListener(){
            public void actionPerformed(ActionEvent e) {

                repaint();
            }
        }).start();
    }

    public static void LoadWorld(){

        Character me = new Character("Andreas", CharacterType.WARRIOR, new Position(4,4),"O");
        Character enemy = new Character("Goblin",CharacterType.GOBLIN, new Position(8,8),"O");

        world = new WorldMap(20,10);
        world.addCharacter(me);
        world.addCharacter(enemy);



    }


    public static void main(String args[]){
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {

                MainFrame frame = new MainFrame();
                frame.setLayout(new GridLayout(5, 5));


                frame.setTitle("Game");
                frame.setResizable(false);
                frame.setSize(600, 600);
                frame.setMinimumSize(new Dimension(600, 600));
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.pack();
                frame.setVisible(true);

                LoadWorld();



            }
        });
    }

    @Override
    public void keyTyped(KeyEvent e) {

    }



    @Override
    public void keyPressed(KeyEvent e) {
        int keyCode = e.getKeyCode();
 /*
        Character me = world.worldCharacters.get(0);

        if(keyCode == KeyEvent.VK_W) {
            me.move(Direction.UP);
        }
        else if(keyCode == KeyEvent.VK_S) {
            me.move(Direction.DOWN);
        }
        else if(keyCode == KeyEvent.VK_D) {
            me.move(Direction.RIGHT);
        }
        else if(keyCode == KeyEvent.VK_A) {
            me.move(Direction.LEFT);
        }
        else if(keyCode == KeyEvent.VK_Q) {
            System.out.println(me.inventory.toString());
        }
        */

    }

    @Override
    public void keyReleased(KeyEvent e) {
        System.out.println(e.getKeyCode());
    }



    @Override
    public void paint(Graphics g) {
        super.paint(g);
        world.updateWorld(g);
        //g.drawRect(posX, posY, 50, 50);
    }
}
