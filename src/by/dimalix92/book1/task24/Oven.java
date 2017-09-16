package by.dimalix92.book1.task24;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 */
public class Oven extends Appliances {


    private boolean isOn;

    protected void cook(String typeOfCooking){
        System.out.println("Я готовлю "+ typeOfCooking);
    }

    @Override
    protected void on() {
        isOn = true;
    }

    @Override
    protected void off() {
        isOn = false;
    }

    @Override
    protected boolean getState() {
        return isOn;
    }
}
