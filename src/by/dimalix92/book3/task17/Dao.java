package by.dimalix92.book3.task17;


import java.util.ArrayList;

/**
 * Created by LIKHTAROVICH on 31.08.2017.
 */
public interface Dao {
    Receiver getReceiver(int num);

    Expense getExpence(int num);

    ArrayList<Receiver> getReceivers();

    ArrayList<Expense> getExpences();

    int addReceiver(Receiver receiver);

    int addExpence(Expense expense);
}
