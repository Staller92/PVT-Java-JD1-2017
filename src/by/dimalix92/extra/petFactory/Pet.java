package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
abstract class Pet {

    private Type typePet;
    private String name="Animal";

    public Type getTypePet() {
        return typePet;
    }

    public void setTypePet(Type typePet) {
        this.typePet = typePet;
    }

    public Pet(){}
    public Pet(String name){
        this.name=name;
    }


    protected abstract void say();



    @Override
    public String toString() {
        return "Я "+ getTypePet()+ " меня зовут " +name ;
    }
}
