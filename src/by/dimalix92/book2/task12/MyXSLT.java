package by.dimalix92.book2.task12;


import org.w3c.dom.Document;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.*;

/**
 * Created by LIKHTAROVICH on 08.09.2017.
 * Напишите программу преобразующую созданный в предыдущих заданиях xml файл
 * в html, аналогично данному примеру, в каждой ячейке дополнительно к координате должны
 * выводится еденицы измерения. Результат должен записываться в файл на диске.
 */
public class MyXSLT {
    public static void main(String[] args) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task12\\result.txt"));
            File fileXML = new File("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task12\\points.xml");
            File stylesheet = new File("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task12\\points.xsl");
            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = factory.newDocumentBuilder();
            Document doc = builder.parse(fileXML);
            StreamSource styleSorce = new StreamSource(stylesheet);

            Transformer t = TransformerFactory.newInstance().newTransformer(styleSorce);
            t.transform(new DOMSource(doc.getDocumentElement()), new StreamResult(writer));
            System.out.println("File was written to \"result.txt\" ");
        } catch (ParserConfigurationException e) {
            e.printStackTrace();
        } catch (SAXException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (TransformerException e) {
            e.printStackTrace();
        }
    }

}
