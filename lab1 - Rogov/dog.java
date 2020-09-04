package ru.mirea.ikbo_01_19.lab_1;

public class dog {
    String dog_name;
    int dog_age;

    public dog() {
        dog_name = "Unnamed";
        dog_age = 0; // Родился
    }

    public dog(String m_name, int m_age) {
        dog_name = m_name;
        dog_age = m_age;
    }

    public void say_gav() {
        System.out.println("GAV!");
        System.out.println("I am " + dog_name + " " + dog_age + " year(s) old!");
    }

    public String toString() {
        return get_dog_name() + " " + get_dog_age() + "y.o. ";
    }

    public void set_dog_name(String m_name) {
        dog_name = m_name;
    }

    public void set_dog_age(int m_age) {
        dog_age = m_age;
    }

    public String get_dog_name() {
        return dog_name;
    }

    public int get_dog_age() {
        return dog_age;
    }
}
