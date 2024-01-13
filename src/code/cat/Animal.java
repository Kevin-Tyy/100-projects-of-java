package code.cat;

public abstract class Animal implements IAnimal {
    String sound;

    public Animal (String sound){
        this.sound = sound;
    }
}
