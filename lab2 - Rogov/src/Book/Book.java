package Book;

public class Book {
    String name_of_book;
    String author_name;
    int price;
    int year_of_print;
    int nomber_of_pages;
    String country;

    public Book(String name_of_book, String author_name, int price,
                int year_of_print, int nomber_of_pages, String country) {
        this.name_of_book = name_of_book;
        this.author_name = author_name;
        this.price = price;
        this.year_of_print = year_of_print;
        this.nomber_of_pages = nomber_of_pages;
        this.country = country;
    }

    @Override
    public String toString() {
        return "Book {" +
                "name_of_book='" + name_of_book + '\'' +
                ", author_name='" + author_name + '\'' +
                ", price=" + price +
                ", year_of_print=" + year_of_print +
                ", nomber_of_pages=" + nomber_of_pages +
                ", country='" + country + '\'' +
                '}';
    }

    public String getName_of_book() {
        return name_of_book;
    }

    public void setName_of_book(String name_of_book) {
        this.name_of_book = name_of_book;
    }

    public String getAuthor_name() {
        return author_name;
    }

    public void setAuthor_name(String author_name) {
        this.author_name = author_name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear_of_print() {
        return year_of_print;
    }

    public void setYear_of_print(int year_of_print) {
        this.year_of_print = year_of_print;
    }

    public int getNomber_of_pages() {
        return nomber_of_pages;
    }

    public void setNomber_of_pages(int nomber_of_pages) {
        this.nomber_of_pages = nomber_of_pages;
    }
}
