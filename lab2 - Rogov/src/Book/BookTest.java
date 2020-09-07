package Book;

public class BookTest {
    public static void main(String[] args) {
        Book book = new Book("To build a fire", "Jack London", 500,
                1902, 500, "USA");

        System.out.println(book.toString());
    }
}
