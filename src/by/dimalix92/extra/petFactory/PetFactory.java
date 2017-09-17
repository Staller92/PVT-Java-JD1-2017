package by.dimalix92.extra.petFactory;

/**
 * Created by LIKHTAROVICH on 19.08.2017.
 */
public class PetFactory {
    public static Pet builder(Type typePet, String name) {
        Pet pet = null;
        switch (typePet) {
            case Собака:
                pet = new Dog(name);
                break;
            case Кот:
                pet = new Cat(name);
                break;
            case Попугай:
                pet = new Parrot(name);
                break;
            case Хомяк:
                pet = new Hamster(name);
                break;
        }
        pet.setTypePet(typePet);
        pet.say();
        return pet;
    }
    public static Pet builder(Type typePet) {
        Pet pet = null;
        switch (typePet) {
            case Собака:
                pet = new Dog();
                break;
            case Кот:
                pet = new Cat();
                break;
            case Попугай:
                pet = new Parrot();
                break;
            case Хомяк:
                pet = new Hamster();
                break;
        }
        pet.setTypePet(typePet);
        pet.say();
        return pet;
    }

}
