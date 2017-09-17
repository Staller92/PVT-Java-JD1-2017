package by.dimalix92.extra.trafficLight;

import java.applet.Applet;


/**
 * Created by LIKHTAROVICH on 17.09.2017.
 * Реализовывать работу светофора (красный, желтый, зеленый) со следующим алгоритмом по циклу:
 * красный [on], желтый [off], зеленый [off] - горит 10 секунд
 * красный [on], желтый [on], зеленый [off] - горит 5 секунд
 * красный [off], желтый [off], зеленый [on] - горит 10 секунд
 * красный [off], желтый [on], зеленый [off] - горит 5 секунд
 */
public class MyApplet extends Applet {

    Balloon balloon1 = new Balloon(175,100);
    Balloon balloon2 = new Balloon(175,150);
    Balloon balloon3 = new Balloon(175,200);

    Balloon[] balloons=new Balloon[3];


    @Override
    public void init() {
        balloons[0]=balloon1;
        balloons[1]=balloon2;
        balloons[2]=balloon3;


        for (int i = 0; i <3 ; i++) {


            ThreadBallon threadBallon1=new ThreadBallon(balloons);
            threadBallon1.setGraphics(getGraphics());
            threadBallon1.start();
        }

    }


}

