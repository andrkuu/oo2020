package graphics;

public class Square extends Shape{
    int x;
    int y;
    Square(int x,int y){
        this.x = x;
        this.y = y;
        this.setArea(x*y);
    }

    @Override
    public float getArea() {
        return super.getArea();
    }
}
