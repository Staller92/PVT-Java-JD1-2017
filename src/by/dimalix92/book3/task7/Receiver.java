package by.dimalix92.book3.task7;

import java.io.Serializable;

/**
 * Created by LIKHTAROVICH on 31.08.2017.
 */
public class Receiver implements Serializable {
    private int num;
    private String name;


    public Receiver(){}


    public Receiver(int num,String name){
        this.num=num;
        this.name=name;
    }


    public int getNum() {
        return num;
    }
    public void setNum(int num) {
        this.num = num;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getNum() + "\t" +getName();

    }
}
