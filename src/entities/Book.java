package entities;

import javax.xml.bind.annotation.*;

public class Book {
    private String author;
    private String title;
    private String genre;
    private String price;
    private String publish_date;


    public void setAuthor(String author) {
        this.author = author;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getPrice() {
        return price;
    }

    public String getPublish_date() {
        return publish_date;
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
        return "entities.Book:\n" +
                "author:" + author + '\n' +
                "title:" + title + '\n' +
                "genre:" + genre + '\n' +
                "price:" + price + '\n' +
                "publish_date :" + publish_date + '\n' + "===============";
    }
}
