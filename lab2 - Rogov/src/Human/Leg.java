package Human;

public class Leg {
    boolean is_valid;
    int nomber_of_fingers;
    int length;
    boolean has_muscules;

    public Leg(boolean is_valid, int nomber_of_fingers, int length, boolean has_muscules) {
        this.is_valid = is_valid;
        this.nomber_of_fingers = nomber_of_fingers;
        this.length = length;
        this.has_muscules = has_muscules;
    }

    public boolean isIs_valid() {
        return is_valid;
    }

    public int getNomber_of_fingers() {
        return nomber_of_fingers;
    }

    public int getLength() {
        return length;
    }

    public boolean isHas_muscules() {
        return has_muscules;
    }

    public void setIs_valid(boolean is_valid) {
        this.is_valid = is_valid;
    }

    public void setNomber_of_fingers(int nomber_of_fingers) {
        this.nomber_of_fingers = nomber_of_fingers;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public void setHas_muscules(boolean has_muscules) {
        this.has_muscules = has_muscules;
    }

    public String toString() {
        return "Leg {" +
                "is_valid=" + is_valid +
                ", nomber_of_fingers=" + nomber_of_fingers +
                ", length=" + length +
                ", has_muscules=" + has_muscules +
                '}';
    }
}
