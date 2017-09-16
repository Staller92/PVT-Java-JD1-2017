package by.dimalix92.book2.task1;

/**
 * Created by LIKHTAROVICH on 20.08.2017.
 */
public enum Goods {

    MILK(10),
    SUGAR(20),
    BEAF(30),
    BEER(20),
    BREAD(5),
    BUTTER(4),
    CHEESE(5),
    CHIKEN(7),
    EGGS(8),
    FISH(6),
    TOMATO(9),
    SOLT(10);

    public int getPrice() {
        return price;
    }
    public static int getGoodsAmount() {
        return Goods.values().length;
    }

    private int price;

    Goods(int price) {
        this.price = price;
    }


}
