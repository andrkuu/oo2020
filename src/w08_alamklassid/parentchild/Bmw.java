package parentchild;

public class Bmw extends Car {

    private boolean rusty;

    public Bmw(String model, boolean rusty){
        super(model);
        this.rusty = rusty;
        this.isIndependent = false;
    }

    public void speak(){
        super.speak();
        System.out.println("I am rusty " + this.rusty);
    }


}