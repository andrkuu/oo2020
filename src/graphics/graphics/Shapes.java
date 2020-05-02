package graphics;

public class Shapes {

    public static void main(String[] args){

        Square s = new Square(5,10);
        System.out.println(s.getArea());

        Triangle t = new Triangle(10,5,5);
        System.out.println(t.getArea());

    }

}
