package by.dimalix92.book1.task25;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 */
public abstract class Cart {
    private int amountOfMoney = 0;
    private String cartBrand = "Unknown";


    public Cart(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }


    public void setAmountOfMoney(int amountOfMoney) {
        this.amountOfMoney = amountOfMoney;
    }

    public int getAmountOfMoney() {
        return amountOfMoney;
    }

    public void setCartBrand(String cartBrand) {
        this.cartBrand = cartBrand;
    }

    public String getCartBrand() {
        return cartBrand;
    }

   protected abstract void transaction(Cart cart, int trans);

}
