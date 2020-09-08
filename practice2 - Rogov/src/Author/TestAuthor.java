package Author;

public class TestAuthor {

    public static void main(String[] args) {
        Author author = new Author("Didkovsky", "did.kov@gmail.com", 'm');
        System.out.println(author);
        author.setEmail("email.yandex.ru");

        System.out.println(author);
    }
}
