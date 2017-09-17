package by.dimalix92.book3.task17;

import java.io.Serializable;

/**
 * Created by LIKHTAROVICH on 31.08.2017.
 */
public class Expense implements Serializable {

    private int num;
    private String paydate;
    private int receiver;
    private int value;
    public Expense (){}


    public Expense (int num,String paydate,int receiver,int value){
        this.num=num;
        this.paydate=paydate;
        this.receiver=receiver;
        this.value=value;
    }
    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getPaydate() {
        return paydate;
    }

    public void setPaydate(String paydate) {
        this.paydate = paydate;
    }

    public int getReceiver() {
        return receiver;
    }

    public void setReceiver(int receiver) {
        this.receiver = receiver;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return getNum() + "\t" + getPaydate() + "\t" + getReceiver() + "\t" + getValue();
    }
}