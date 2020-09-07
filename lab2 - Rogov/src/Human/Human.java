package Human;

import java.util.Scanner;

public class Human {
    Leg left_leg;
    Leg right_leg;
    Hand left_hand;
    Hand right_hand;
    Head head;
    int age;
    String name;

    public Human(int age, String name) {
        Scanner sc = new Scanner(System.in);

        this.age = age;
        this.name = name;

        System.out.print("Have left hand? ");
        boolean is_valid = sc.nextBoolean();
        System.out.print("Nomber_of_fingers? ");
        int nomber_of_fingers = sc.nextInt();
        System.out.print("length? ");
        int length = sc.nextInt();
        System.out.print("Has_muscules? ");
        boolean has_muscules = sc.nextBoolean();
        left_leg = new Leg(is_valid, nomber_of_fingers, length, has_muscules);

        System.out.print("Have right_leg? ");
        is_valid = sc.nextBoolean();
        System.out.print("Nomber_of_fingers? ");
        nomber_of_fingers = sc.nextInt();
        System.out.print("length? ");
        length = sc.nextInt();
        System.out.print("Has_muscules? ");
        has_muscules = sc.nextBoolean();
        right_leg = new Leg(is_valid, nomber_of_fingers, length, has_muscules);

        System.out.print("Have left_hand? ");
        is_valid = sc.nextBoolean();
        System.out.print("Nomber_of_fingers? ");
        nomber_of_fingers = sc.nextInt();
        System.out.print("length? ");
        length = sc.nextInt();
        System.out.print("Has_muscules? ");
        has_muscules = sc.nextBoolean();
        left_hand = new Hand(is_valid, nomber_of_fingers, length, has_muscules);

        System.out.print("Have right_hand? ");
        is_valid = sc.nextBoolean();
        System.out.print("Nomber_of_fingers? ");
        nomber_of_fingers = sc.nextInt();
        System.out.print("length? ");
        length = sc.nextInt();
        System.out.print("Has_muscules? ");
        has_muscules = sc.nextBoolean();
        right_hand = new Hand(is_valid, nomber_of_fingers, length, has_muscules);

        System.out.print("Have head? ");
        is_valid = sc.nextBoolean();
        System.out.print("is_stupid? ");
        boolean is_stupid = sc.nextBoolean();
        System.out.print("radius head? ");
        int radius = sc.nextInt();
        System.out.print("hair_color? ");
        String hair_color = sc.nextLine();

        head = new Head(is_valid, is_stupid, radius, hair_color);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
