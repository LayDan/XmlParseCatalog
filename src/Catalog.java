import javax.xml.bind.annotation.*;
import java.util.ArrayList;

@XmlRootElement(name = "catalog")
//@XmlType(propOrder = {"name_Catalog", "booksList"})
@XmlAccessorType(XmlAccessType.FIELD)
public class Catalog {

    //    @XmlElement(name = "name_Catalog")
    private String name_Catalog;

    public String getName_Catalog() {
        return name_Catalog;
    }

    public void setName_Catalog(String name_Catalog) {
        this.name_Catalog = name_Catalog;
    }

    public void setBooksList(ArrayList<Book> booksList) {
        this.booksList = booksList;
    }

    public ArrayList<Book> getBooksList() {
        return booksList;
    }

    //    @XmlElement(name = "booksList")
    private ArrayList<Book> booksList;

    public Catalog() {
    }

    public Catalog(String name_Catalog) {
        this.name_Catalog = name_Catalog;
        booksList = new ArrayList<>();
    }
}
