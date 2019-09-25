package entities;

import javax.xml.bind.annotation.*;
import java.util.ArrayList;


@XmlRootElement
public class Catalog {
    public Catalog() {
    }

    private ArrayList<Book> getBook() {
        return book;
    }

    public void setBook(ArrayList<Book> book) {
        this.book = book;
    }

    @Override
    public String toString() {
        String ans = "";
        for (Book a : getBook()) {
            ans = ans.concat(a.toString() + "\n");
        }
        return ans;
    }

    private ArrayList<Book> book;


}
