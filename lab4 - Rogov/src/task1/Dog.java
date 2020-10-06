package task1;

public class Dog implements Nameable {
    private String name;
    private String poroda;

    public Dog(String name, String poroda) {
        this.name = name;
        this.poroda = poroda;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    @Override
    public String getName() {
        return name;
    }
}
