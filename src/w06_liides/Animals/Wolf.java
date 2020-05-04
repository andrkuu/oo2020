package Animals;

public class Wolf implements AnimalBehaviour{


    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " WOOF");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " I ate some rabbits");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " Koerauni");
    }

    @Override
    public boolean beSneaky() {
        return false;
    }

    @Override
    public void lookAround() {

    }

    @Override
    public boolean attack() {
        return false;
    }

    @Override
    public boolean defend() {
        return false;
    }
}
