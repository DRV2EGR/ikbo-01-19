package task1;

import java.awt.*;

public class Rect extends Shape {

    public Rect(int x, int y, int type) {
        super(x, y, type);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = rand.nextInt();
        g.fillRect(x, y, rand.nextInt(), rand.nextInt());
        g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
    }
}
