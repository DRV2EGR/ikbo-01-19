package task1;

import java.awt.*;
import java.awt.geom.Ellipse2D;
import java.util.Random;

public class Figure extends Shape {

    public Figure(int x, int y, int type) {
        super(x, y, type);

    }

    final Random r=new Random();

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(new Color(r.nextInt(255), r.nextInt(255),
                r.nextInt(255)));

        switch (type) {
            case 0:
                g.fillRect(x, y, r.nextInt(100), r.nextInt(100));
                //setBounds(x, y, x, y);
                break;
            case 1:
                int w = r.nextInt(10);
                g.fillOval(x, y, w, w);
                //this.setBounds(x, y, w, w);
                break;

                /*Graphics2D g2d = (Graphics2D) g;
                Ellipse2D.Double circle = new Ellipse2D.Double(x, y, 10, 10);

                g2d.setColor(Color.GRAY);
                g2d.fill(circle);*/
        }


    }
}
