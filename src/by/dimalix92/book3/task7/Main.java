package by.dimalix92.book3.task7;


import java.util.ArrayList;
import java.util.Iterator;


/**
 * Created by LIKHTAROVICH on 31.08.2017.
 * Создайте объект Dao на основе интерфейса приведенного выше.
 */
public class Main {
    public static void main(String[] args) {
        Dao myDao = DaoImpl.getDaoImpl();
        Expense expense = new Expense(15, "2017-09-01", 5, 1000);
        Receiver receiver = new Receiver(6, "GreenCity");
        myDao.addExpence(expense);
        myDao.addReceiver(receiver);
        myDao.getReceiver(5);
        myDao.getExpence(14);
        ArrayList<Receiver> listRs = myDao.getReceivers();
        ArrayList<Expense> listEx = myDao.getExpences();
        readFrom(listRs);
        readFrom(listEx);
    }


    private static void readFrom(ArrayList list) {
        Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
    }
}