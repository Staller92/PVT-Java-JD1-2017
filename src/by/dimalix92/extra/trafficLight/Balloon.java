package by.dimalix92.extra.trafficLight;

import java.awt.*;


/**
 * Created by LIKHTAROVICH on 17.09.2017.
 */

public class Balloon {

    private int x;
    private int y;

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    private Color color;


    public Balloon(int initialX, int initialY) {
        x = initialX;
        y = initialY;

    }


    public synchronized void draw(Graphics g) {


        g.setColor(color);
        g.fillOval(x, y, 50, 50);

    }
}

