package Human;

public class Head {
    boolean is_valid;
    boolean is_stupid;
    int radius;
    String hair_color;

    public Head(boolean is_valid, boolean is_stupid, int radius, String hair_color) {
        this.is_valid = is_valid;
        this.is_stupid = is_stupid;
        this.radius = radius;
        this.hair_color = hair_color;
    }

    public boolean isIs_valid() {
        return is_valid;
    }

    public boolean isIs_stupid() {
        return is_stupid;
    }

    public int getRadius() {
        return radius;
    }

    public String getHair_color() {
        return hair_color;
    }

    public void setIs_valid(boolean is_valid) {
        this.is_valid = is_valid;
    }

    public void setIs_stupid(boolean is_stupid) {
        this.is_stupid = is_stupid;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }

    public void setHair_color(String hair_color) {
        this.hair_color = hair_color;
    }

    public String toString() {
        return "Head {" +
                "is_valid=" + is_valid +
                ", is_stupid=" + is_stupid +
                ", radius=" + radius +
                ", hair_color='" + hair_color + '\'' +
                '}';
    }
}
