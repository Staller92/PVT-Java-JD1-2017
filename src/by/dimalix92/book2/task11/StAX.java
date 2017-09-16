package by.dimalix92.book2.task11;


import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.XMLStreamReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * Created by LIKHTAROVICH on 07.09.2017.
 * Напишите программу, которая будет разбирать xml файл сделанный в предыдущих заданиях с помощью StAX
 * и выводить его на экран в текстовом виде. Каждая точка должна выводиться на отдельной строке в виде двух
 * чисел, разделенных запятой, при этом должна выводится еденица измерения.
 * Например: 10 px, 30 px.
 */
public class StAX {
    public static void main(String[] args) {
        boolean isX = false;
        boolean isY = false;
        boolean isAtr = false;
        String atr = null;
        XMLInputFactory factory = XMLInputFactory.newFactory();
        try {
            XMLStreamReader reader = factory.createXMLStreamReader(new FileInputStream("D:\\My tasks\\Java\\PVT\\src\\by\\dimalix92\\book2\\task11\\points.xml"));
            while (reader.hasNext()) {
                int res = reader.next();
                if (res == reader.START_ELEMENT) {
                    if (reader.getLocalName().equals("x"))
                        isX = true;
                    else if (reader.getLocalName().equals("y"))
                        isY = true;

                    else if (reader.getAttributeCount() > 0)
                        atr = reader.getAttributeValue(0);
                    isAtr = true;
                } else if (res == reader.CHARACTERS) {
                    if (isX && isAtr) {
                        System.out.print(reader.getText() + atr + ", ");
                        isX = false;
                        isAtr = false;
                    } else if (isY && isAtr) {
                        System.out.print(reader.getText() + atr + "\n");
                        isY = false;
                        isAtr = false;
                    }

                }

            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (XMLStreamException e) {
            e.printStackTrace();
        }

    }
}
