package ru.mirea.ikbo_01_19.lab_1;

public class ball {
    String ball_maker; // Производитель
    String ball_color;
    int ball_radius;
    int ball_price;

    public ball () {
        ball_maker = "-";
        ball_color = "uncolored";
        ball_radius = -1; // Not setted
        ball_price = -1; // Бесценно!
    }

    public ball (String m_ball_maker, String m_ball_color,
                 int m_radius, int m_price) {
        ball_maker = m_ball_maker;
        ball_color = m_ball_color;
        ball_radius = m_radius;
        ball_price = m_price;
    }

    public String toString() {
        return get_ball_color() + " " + get_ball_price() + "$ " + get_ball_maker() + " " + get_ball_radius();
    }

    String get_ball_maker() {
        return ball_maker;
    }

    String get_ball_color() {
        return ball_color;
    }

    int get_ball_radius() {
        return ball_radius;
    }

    int get_ball_price() {
        return ball_price;
    }

    void set_ball_maker(String m_ball_maker) {
        ball_maker = m_ball_maker;
    }

    void set_ball_color(String m_ball_color) {
        ball_color = m_ball_color;
    }

    void set_ball_radius(int m_ball_radius) {
        ball_radius = m_ball_radius;
    }

    void set_ball_price(int m_ball_price) {
        ball_price = m_ball_price;
    }

}

