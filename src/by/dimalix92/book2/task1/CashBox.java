package by.dimalix92.book2.task1;

import java.util.Date;
import java.util.Map;


/**
 * Created by LIKHTAROVICH on 20.08.2017.
 */
public class CashBox {
    private static int countReceipt = 1;
    private final int ID;

    public CashBox(int ID) {
        this.ID = ID;
    }


    public synchronized void service(Map<Goods, Integer> basket) {

        System.out.println("RECEIPT# " + countReceipt + "\t" + new Date());
        int total = 0;
        for (Map.Entry<Goods, Integer> pair : basket.entrySet()) {
            total = total + pair.getValue() * pair.getKey().getPrice();
            System.out.println(pair.getKey() + "\t\t" + pair.getValue() + " шт." + "\t" + pair.getValue() * pair.getKey().getPrice() + " USD");
        }
        System.out.println("TOTAL: " + "\t\t\t\t" + total + " USD");
        countReceipt++;
        notifyAll();
    }

    public String toString() {
        return "Identification number of cashbox: ID" + ID;
    }

}
