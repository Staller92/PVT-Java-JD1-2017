package by.dimalix92.book1.task25;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 */
public class Visa extends Cart {
    int tax=5;

    public Visa(int amountOfMoney) {
        super(amountOfMoney);
    }

    @Override
    public void transaction(Cart cart,int trans) {
        this.setAmountOfMoney((this.getAmountOfMoney()-trans)*(100-tax)/100);
        cart.setAmountOfMoney((cart.getAmountOfMoney()+trans)*(100-tax)/100);
    }
}
