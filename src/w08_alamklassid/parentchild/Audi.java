package parentchild;

public class Audi extends Car {

    public Audi(String model){
        super(model);
        this.isIndependent = false;
    }

    public void speak(){
        super.speak();
    }
}