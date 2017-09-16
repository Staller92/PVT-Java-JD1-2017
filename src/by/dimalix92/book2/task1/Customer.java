package by.dimalix92.book2.task1;

import java.util.*;

/**
 * Created by LIKHTAROVICH on 20.08.2017.
 */
public class Customer {


    private Map<Goods, Integer> basket = new HashMap<>();
    private Random random = new Random();

    private void addGoodsInBasket() {
        for (int i = 0; i < random.nextInt(10) + 1; i++) {

            basket.put(Goods.values()[random.nextInt(Goods.getGoodsAmount())], random.nextInt(10) + 1);
        }
    }

    public Customer() {
        addGoodsInBasket();
    }

    public Map<Goods, Integer> getBasket() {
        return basket;
    }


}



