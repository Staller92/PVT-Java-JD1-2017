package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class Parrot extends Pet {
    public Parrot(){}
    public Parrot(String name) {
        super(name);
    }
    @Override
    protected void say() {
        System.out.println("Арррр");
    }
}
