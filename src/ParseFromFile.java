import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;
import java.util.jar.JarEntry;

public class ParseFromFile {

    public Catalog parseFromFile() throws ParserConfigurationException, IOException, SAXException {
//        // дерево DOM из файла
//        DocumentBuilder documentBuilder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
//        Document document = documentBuilder.parse("XmlToParse.xml");
//
//        //корневой элемент
//        Node root = document.getDocumentElement();
//        Catalog catalog = new Catalog("BookShop");
//        //"массив" подкорневых элеметов
//        NodeList books = root.getChildNodes();
//
//        //Пробегаю по этому "массиву" и проверяю каждый его элемент
//        for (int i = 0; i < books.getLength(); i++) {
//            int a = books.getLength();
//            Node book = books.item(i);
//            if (book.getNodeType() != Node.TEXT_NODE) {            //Проверка на то, действительно ли это книга
//                catalog.getBooksList().add(new Book());
//                NodeList bookProps = book.getChildNodes();
//                for (int j = 0; j < bookProps.getLength(); j++) {
//                    Node bookProp = bookProps.item(j);
//                    if (bookProp.getNodeName().equals("author")) {
//                        catalog.getBooksList().get(catalog.getBooksList().size() - 1).setAuthor
//                                (bookProp.getChildNodes().item(0).getTextContent());        //ставим автора
//                    }
//                    if (bookProp.getNodeName().equals("title")) {
//                        catalog.getBooksList().get(catalog.getBooksList().size() - 1).setTitle
//                                (bookProp.getChildNodes().item(0).getTextContent());        //ставим название
//                    }
//                    if (bookProp.getNodeName().equals("genre")) {
//                        catalog.getBooksList().get(catalog.getBooksList().size() - 1).setGenre
//                                (bookProp.getChildNodes().item(0).getTextContent());        //ставим жанр
//                    }
//                    if (bookProp.getNodeName().equals("price")) {
//                        catalog.getBooksList().get(catalog.getBooksList().size() - 1).setPrice
//                                (bookProp.getChildNodes().item(0).getTextContent());        //ставим цену
//                    }
//                    if (bookProp.getNodeName().equals("publish_date")) {
//                        catalog.getBooksList().get(catalog.getBooksList().size() - 1).setPublish_date
//                                (bookProp.getChildNodes().item(0).getTextContent());        //ставим дату публикации
//                    }
//                }
//            }
//        }
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Catalog catalog = (Catalog) jaxbContext.createUnmarshaller().unmarshal(new File("XmlToParse.xml"));
            return catalog;
        } catch (JAXBException e) {
            e.printStackTrace();
        }

//        return catalog;
        return null;
    }
}
