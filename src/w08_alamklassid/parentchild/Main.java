package parentchild;

public class Main {
    public static void main(String[] args) {
        Audi car1 = new Audi("80");
        car1.speak();

        Bmw car2 = new Bmw("X6",true);
        car2.speak();

        Lamborghini car3 = new Lamborghini("aventador",true);
        car3.speak();

    }
}
