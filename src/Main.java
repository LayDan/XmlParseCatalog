import org.xml.sax.SAXException;

import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        Catalog newCatalog = new ParseFromFile().parseFromFile();
        for (Book a:newCatalog.getBooksList()) {
            System.out.println(a.toString());
        }
    }

}
