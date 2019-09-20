import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        // дерево DOM из файла
        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
        Document document = documentBuilder.parse("XmlToParse.xml");

        //корневой элемент
        Node root = document.getDocumentElement();
        //"массив" подкорневых элеметов
        NodeList books = root.getChildNodes();

        //Пробегаю по этому "массиву" и проверяю каждый его элемент
        for (int i = 0; i < books.getLength(); i++) {
            Node book = books.item(i);
            if (book.getNodeType() != Node.TEXT_NODE) {               //Проверка на то, действительно ли это книга
                NodeList bookProps = book.getChildNodes();
                for (int j = 0; j < bookProps.getLength(); j++) {
                    Node bookProp = bookProps.item(j);
                    if (bookProp.getNodeType() != Node.TEXT_NODE) {  //Проверка на то, является ли это параметром книги
                        System.out.println(bookProp.getNodeName() + ":" + bookProp.getChildNodes().item(0).getTextContent());
                    }
                }
                System.out.println("=================================");
            }
        }

    }

}
