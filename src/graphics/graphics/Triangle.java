package graphics;

public class Triangle extends Shape{
    int a;
    int b;
    int c;
    Triangle(int a, int b, int c){
        this.a = a;
        this.b = b;
        this.c = c;
        this.setArea((a*b)/2);
    }

    @Override
    public float getArea() {
        return super.getArea();
    }
}
