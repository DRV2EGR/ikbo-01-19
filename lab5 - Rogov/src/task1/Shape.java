package task1;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public abstract class Shape extends JComponent {
    public int x;
    public int y;
    public int type;
    public Color color;
    Random rand = new Random();

    public Shape(int x, int y, int type) {
        this.x = x;
        this.y = y;
        this.type = type;


    }

    /*public void paintComponent(Graphics g)
    {
        switch (type) {
            case 0: g.fillRect(x, y, rand.nextInt(), rand.nextInt()); break;
            case 1: int w = rand.nextInt(); g.fillOval(x, y, w, w);
            case 2:
        }
    }*/
}
