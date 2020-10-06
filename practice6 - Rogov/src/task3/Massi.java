package task3;

public class Massi implements Comparable<Massi> {
    private Integer val;

    Massi(Integer i) {
        val = i;
    }

    public int compareTo(Massi o) {
        int result = this.val.compareTo(o.val);

        return result;
    }

    @Override
    public String toString() {
        return  " " + val;
    }
}
