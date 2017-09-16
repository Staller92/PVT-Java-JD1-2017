package by.dimalix92.book1.task24;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 * Создать иеархию классов, описывающих бытовую технику. Создать несколько объектов описанных классов,
 * часть из них включить в розетку. Иеархия должна быть хотя бы три уровня.
 */
public class Main {
    public static void main(String[] args) {
        ElectricOven electricOven = new ElectricOven();
        electricOven.on();
        electricOven.setTypeOfCooking("Пицца");
        ElectricOven electricOven1 = new ElectricOven();
        electricOven1.off();
        electricOven1.setTypeOfCooking("Суп");
    }

}
