package Dog;

public class Labrodor extends Dog{
    String poroda;
    int muscules;
    int medals;

    public void win_medal() {
        System.out.println("I am win a medal!");
        this.medals++;
    }

    public Labrodor(String name, int age, String poroda, int nomber_of_owners, boolean bezdomniy,
                    String adress, String poroda1, int muscules, int medals) {
        super(name, age, poroda, nomber_of_owners, bezdomniy, adress);

        this.poroda = poroda1;
        this.muscules = muscules;
        this.medals = medals;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public int getMuscules() {
        return muscules;
    }

    public void setMuscules(int muscules) {
        this.muscules = muscules;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return "Labrodor{" +
                "poroda='" + poroda + '\'' +
                ", muscules=" + muscules +
                ", medals=" + medals +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nomber_of_owners=" + nomber_of_owners +
                ", bezdomniy=" + bezdomniy +
                ", adress='" + adress + '\'' +
                '}';
    }
}
