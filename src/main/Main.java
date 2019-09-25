package main;

import entities.Catalog;
import workWithFile.ParseFromFile;

import javax.xml.bind.JAXBException;

public class Main {

    public static void main(String[] args) throws JAXBException {
        Catalog catalog;
        ParseFromFile parseFromFile = new ParseFromFile();
//        parseFromFile.parseToFile("Test.xml", catalog);
        catalog = parseFromFile.parseFromFile("Test.xml");
        System.out.println(catalog.toString());
    }
}
