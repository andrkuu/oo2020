package Animals;

public class Main {
    public static void main(String[] args) {
        Bear bear = new Bear();
        bear.speak();
        bear.sleep();
        bear.eat();

        System.out.println("");

        Wolf wolf = new Wolf();
        wolf.speak();
        wolf.sleep();
        wolf.eat();

        System.out.println("");

        Duck duck = new Duck();
        duck.speak();
        duck.sleep();
        duck.eat();

    }
}
