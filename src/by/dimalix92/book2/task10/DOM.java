package by.dimalix92.book2.task10;


import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.*;
import java.io.File;
import java.io.IOException;


/**
 * Created by LIKHTAROVICH on 07.09.2017.
 * Напишите программу, которая будет разбирать XML файл сделанный в предыдущих заданиях
 * с помощью DOM, и выводить его на экран в текстовом виде. Каждая точка должна выводиться на
 * отдельно строке в виде двух чисел, разделеных запятой, при этом должна выводиться еденица измерения.
 * Например: 10 px, 30 px.
 */
public class DOM {
    public static void main(String[] args) {
        File fileXML = new File("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task10\\points.xml");
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
        DocumentBuilder builder = null;
        Document doc = null;
        try {
            builder = factory.newDocumentBuilder();
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        }

        try {
            doc = builder.parse(fileXML);
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

        NodeList list = doc.getElementsByTagName("point");
        for (int i = 0; i < list.getLength(); i++) {
            Element element = (Element) list.item(i);
            System.out.println(element.getNodeName()+" "+(i+1)+": "+element.getElementsByTagName("x").item(0).getChildNodes().item(0).getNodeValue()+element.getAttribute("unit")+", "+element.getElementsByTagName("y").item(0).getChildNodes().item(0).getNodeValue()+element.getAttribute("unit"));

        }



    }
}
