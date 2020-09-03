package ru.mirea.ikbo_01_19.lab_1;

public class book {
    int book_age;
    String book_color;
    String book_name;

    public book() {
        book_age = -1;
        book_color = "undefined"; book_name = "";
    }

    public book (String m_name, int m_age, String m_color) {
        book_name = m_name;
        book_age = m_age;
        book_color = m_color;
    }

    public String toString() {
        return get_book_name() + " " + get_book_age() + "years " + get_book_color();
    }

    void set_book_age(int m_age) {
        book_age = m_age;
    }

    void set_book_color(String m_color) {
        book_color = m_color;
    }

    void set_book_name(String m_name) {
        book_name = m_name;
    }

    int get_book_age() {
        return book_age;
    }

    String get_book_color() {
        return book_color;
    }

    String get_book_name() {
        return book_name;
    }

}
