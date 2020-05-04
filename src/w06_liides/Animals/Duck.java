package Animals;

public class Duck implements AnimalBehaviour{

    @Override
    public void speak() {
        System.out.println( getClass().getSimpleName() +" QUACK");
    }

    @Override
    public void eat() {
        System.out.println(getClass().getSimpleName() + " I ate some seeds");
    }

    @Override
    public void sleep() {
        System.out.println(getClass().getSimpleName() + " uni");
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
