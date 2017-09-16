package by.dimalix92.book1.task24;

/**
 * Created by LIKHTAROVICH on 06.08.2017.
 */
public class ElectricOven extends Oven{


    public void setTypeOfCooking(String typeOfCooking) {
        if (getState()){
            cook(typeOfCooking);
        }
       else System.out.println("Error");
    }




}
