package task1;

import java.awt.*;
import java.awt.geom.AffineTransform;
import java.awt.geom.PathIterator;
import java.awt.geom.Point2D;
import java.awt.geom.Rectangle2D;

public class Circle extends Shape {

    public Circle(int x, int y, int type) {
        super(x, y, 1);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = rand.nextInt();
        g.fillOval(x, y, w, w);
        g.setColor(new Color(rand.nextFloat(), rand.nextFloat(), rand.nextFloat()));
    }
}
