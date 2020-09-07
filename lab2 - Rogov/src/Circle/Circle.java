package Circle;

public class Circle {
    double radius;
    double x_pos;
    double y_pos;
    String background_color;
    String border_color;

    public Circle(double radius, double x_pos, double y_pos,
                  String background_color, String border_color) {
        this.radius = radius;
        this.x_pos = x_pos;
        this.y_pos = y_pos;
        this.background_color = background_color;
        this.border_color = border_color;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getX_pos() {
        return x_pos;
    }

    public void setX_pos(double x_pos) {
        this.x_pos = x_pos;
    }

    public double getY_pos() {
        return y_pos;
    }

    public void setY_pos(double y_pos) {
        this.y_pos = y_pos;
    }

    public String get_background_color() {
        return background_color;
    }
    public String get_border_color() {
        return border_color;
    }
    public void set_radius(int radius) {
        this.radius = radius;
    }
    public void set_x_pos(int x_pos) {
        this.x_pos = x_pos;
    }
    public void set_y_pos(int y_pos) {
        this.y_pos = y_pos;
    }
    public void set_background_color(String background_color) {
        this.background_color = background_color;
    }
    public void set_border_color(String border_color) {
        this.border_color = border_color;
    }

    public String toString() {
        String str = "Circle:" + "\nradius: " + this.radius +
                "\nx = " + this.x_pos +  "\ny = " + this.y_pos +
                "\nbackground_color = " + this.background_color +
                "\nborder_color = " + this.border_color;

        return str;
    }


}
