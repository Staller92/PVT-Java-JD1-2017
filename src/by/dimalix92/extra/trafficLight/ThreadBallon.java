package by.dimalix92.extra.trafficLight;


import java.awt.*;
import java.awt.Graphics;


public class ThreadBallon extends Thread {

    private Graphics graphics;
    private Balloon[] balloons;

    ThreadBallon(Balloon[] balloon) {
        balloons = balloon;

    }

    public void setGraphics(Graphics graphics) {
        this.graphics = graphics;
    }


    @Override
    public void run() {

        balloons[0].setColor(Color.GRAY);
        balloons[0].draw(graphics);

        balloons[1].setColor(Color.GRAY);
        balloons[1].draw(graphics);

        balloons[2].setColor(Color.GRAY);
        balloons[2].draw(graphics);

        try {
            sleep(100);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        while (true) {
            try {

                balloons[0].setColor(Color.RED);
                balloons[0].draw(graphics);

                balloons[1].setColor(Color.GRAY);
                balloons[1].draw(graphics);

                balloons[2].setColor(Color.GRAY);
                balloons[2].draw(graphics);

                sleep(10000);


                balloons[0].setColor(Color.RED);
                balloons[0].draw(graphics);
                balloons[1].setColor(Color.ORANGE);
                balloons[1].draw(graphics);
                sleep(4000);
                for (int i = 0; i < 5; i++) {
                    balloons[1].setColor(Color.GRAY);
                    balloons[1].draw(graphics);
                    sleep(100);
                    balloons[1].setColor(Color.ORANGE);
                    balloons[1].draw(graphics);
                    sleep(100);
                }


                balloons[0].setColor(Color.GRAY);
                balloons[0].draw(graphics);

                balloons[1].setColor(Color.GRAY);
                balloons[1].draw(graphics);

                balloons[2].setColor(Color.GREEN);
                balloons[2].draw(graphics);


                sleep(10000);
                balloons[0].setColor(Color.GRAY);
                balloons[0].draw(graphics);

                balloons[1].setColor(Color.ORANGE);
                balloons[1].draw(graphics);
                sleep(4000);
                for (int i = 0; i < 5; i++) {
                    balloons[1].setColor(Color.GRAY);
                    balloons[1].draw(graphics);
                    sleep(100);
                    balloons[1].setColor(Color.ORANGE);
                    balloons[1].draw(graphics);
                    sleep(100);
                }


            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
