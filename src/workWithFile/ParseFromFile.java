package workWithFile;

import entities.Catalog;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;

public class ParseFromFile {

    public Catalog parseFromFile(String fileName) throws JAXBException {
        if (new File(fileName).isFile()) {
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            return (Catalog) unmarshaller.unmarshal(new File(fileName));
        }
        return null;
    }

    public void parseToFile(String fileName, Catalog catalog) throws JAXBException {
        JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
        Marshaller toFile = jaxbContext.createMarshaller();
        toFile.marshal(catalog, new File(fileName));
    }
}
