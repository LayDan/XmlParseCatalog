import javax.xml.bind.annotation.*;

//@XmlRootElement(name = "book")
//@XmlType(propOrder = {"author", "title", "genre", "price", "publish_date"})
@XmlAccessorType(XmlAccessType.FIELD)

public class Book {
    private String author;
    //    @XmlElement(name = "title"
    private String title;
    //    @XmlElement(name = "genre")
    private String genre;
    //    @XmlElement(name = "price")
    private String price;
    //    @XmlElement(name = "publish_date")
    private String publish_date;

    public Book() {

    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public void setPublish_date(String publish_date) {
        this.publish_date = publish_date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "author='" + author + '\'' +
                ", title='" + title + '\'' +
                ", genre='" + genre + '\'' +
                ", price='" + price + '\'' +
                ", publish_date='" + publish_date + '\'' +
                '}';
    }
}
