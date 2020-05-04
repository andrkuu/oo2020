package Animals;

public class Bear implements AnimalBehaviour{

    @Override
    public void speak() {
        System.out.println(getClass().getSimpleName() + " ROAR");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " I ate some plants");
    }

    @Override
    public void sleep() {

        System.out.println(getClass().getSimpleName() + " Talveuni");
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
