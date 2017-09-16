package by.dimalix92.book2.task9_2;


import by.dimalix92.book2.task9_1.generated.Points;
import by.dimalix92.book2.task9_1.generated.PointsList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;

/**
 * Created by LIKHTAROVICH on 05.09.2017.
 * Java to XML, XML to Java (Marshalling and Unmarshalling)
 */
public class JAXB {

    public static void main(String[] args) {
        // Save objects to XML
        marshal("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task9_2\\points.xml");
         unmarshal("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task9_2\\points.xml");
    }

    public static void marshal(String fileName) {

        Points point1 = new Points();
        point1.setX(10);
        point1.setY(2);
        Points point2 = new Points();
        point2.setX(10);
        point2.setY(200);
        PointsList pointsList = new PointsList();
        pointsList.point.add(point1);
        pointsList.point.add(point2);


        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PointsList.class);
            Marshaller marshaller = jaxbContext.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            FileOutputStream fos = new FileOutputStream(fileName);
            marshaller.marshal(pointsList, fos);
        } catch (JAXBException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void unmarshal(String fileName) {
        try {
            JAXBContext jaxbContext = JAXBContext.newInstance(PointsList.class);
            Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
            PointsList pointsList = (PointsList) unmarshaller.unmarshal(new FileInputStream(fileName));
            System.out.println(pointsList.getPoint().get(0).getX());
            System.out.println(pointsList.getPoint().get(0).getY());
            System.out.println(pointsList.getPoint().get(1).getX());
            System.out.println(pointsList.getPoint().get(1).getY());


        } catch (Exception e) {
            e.printStackTrace();
        }

    }


}

