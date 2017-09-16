package by.dimalix92.book2.task1;

/**
 * Created by LIKHTAROVICH on 20.08.2017.
 */
public class CustomerThread extends Thread {
    public CustomerThread(CashBox cashBox) {
        this.cashBox = cashBox;

    }

    private Customer customer;
    private CashBox cashBox;

    @Override
    public void run() {
        synchronized (cashBox) {
            customer = new Customer();
            cashBox.service(customer.getBasket());
            System.out.println(cashBox.toString() + "\n");
        }
    }
}
