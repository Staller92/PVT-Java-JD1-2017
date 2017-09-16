package by.dimalix92.book1.task25;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 * Создать иеархию классов, описывающих банковские катрочки.
 * Иеархия должна иметь хотя бы три уровня.
 */
public class Main {
    public static void main(String[] args) {
        Cart cart1=new VisaGold(3000);
        cart1.setCartBrand("Visa Gold");
        System.out.println(cart1.getAmountOfMoney());
        System.out.println(cart1.getCartBrand());
        Cart cart2=new VisaGold(5000);
        cart1.transaction(cart2,2000);
        System.out.println(cart1.getAmountOfMoney());
        System.out.println(cart2.getAmountOfMoney());
        Cart cart3=new Visa(3000);
        Cart cart4=new Visa(5000);
        cart3.transaction(cart4,2000);
        System.out.println(cart3.getAmountOfMoney());
        System.out.println(cart4.getAmountOfMoney());


    }
}
