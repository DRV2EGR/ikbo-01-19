package ru.mirea.ikbo_01_19.lab_1;

public class test_class {

    public void make_test() {
        dog t_dog = new dog();
        ball t_ball = new ball();
        book t_book = new book();

        test_dog(t_dog);
        test_ball(t_ball);
        test_book(t_book);

        System.out.println("Testing complete.");
    }

    private void test_dog(dog m_dog) {
        m_dog.set_dog_name("Bobik");
        m_dog.set_dog_age(5);

        m_dog.say_gav();
        System.out.println("Dog " + m_dog.toString());
    }

    private void test_ball(ball m_ball) {
        m_ball.set_ball_maker("China");
        m_ball.set_ball_color("Red");
        m_ball.set_ball_radius(1);
        m_ball.set_ball_price(200);

        System.out.println( "Ball " + m_ball.toString());
    }

    private void test_book(book m_book) {
        m_book.set_book_name("Travelling");
        m_book.set_book_age(17);
        m_book.set_book_color("Colorite");

        System.out.println("Book " + m_book.toString());
    }
}
