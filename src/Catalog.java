import java.util.ArrayList;

public class Catalog {
    private String name_Catalog;

    public String getName_Catalog() {
        return name_Catalog;
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    private ArrayList<Book> booksList;

    public Catalog(String name_Catalog) {
        this.name_Catalog = name_Catalog;
        booksList = new ArrayList<>();
    }
}
