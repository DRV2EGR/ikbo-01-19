package Dog;

public abstract class Dog {
    String name;
    int age;
    int nomber_of_owners;
    boolean bezdomniy;
    String adress;

    public Dog(String name, int age, String poroda,
               int nomber_of_owners, boolean bezdomniy, String adress) {
        this.name = name;
        this.age = age;
        this.nomber_of_owners = nomber_of_owners;
        this.bezdomniy = bezdomniy;
        this.adress = adress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getNomber_of_owners() {
        return nomber_of_owners;
    }

    public void setNomber_of_owners(int nomber_of_owners) {
        this.nomber_of_owners = nomber_of_owners;
    }

    public boolean isBezdomniy() {
        return bezdomniy;
    }

    public void setBezdomniy(boolean bezdomniy) {
        this.bezdomniy = bezdomniy;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }
}
