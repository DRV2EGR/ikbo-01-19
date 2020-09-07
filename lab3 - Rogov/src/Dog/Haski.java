package Dog;

public class Haski extends Dog{
    String poroda;

    public void be_stupid() {
        System.out.println("I am Has!! Hav!");
    }

    public Haski(String name, int age, String poroda, int nomber_of_owners,
                 boolean bezdomniy, String adress, String poroda1) {
        super(name, age, poroda, nomber_of_owners, bezdomniy, adress);
        this.poroda = poroda1;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String toString() {
        return "Haski{" +
                "poroda='" + poroda + '\'' +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", nomber_of_owners=" + nomber_of_owners +
                ", bezdomniy=" + bezdomniy +
                ", adress='" + adress + '\'' +
                '}';
    }
}
