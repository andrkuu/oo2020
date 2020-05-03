package parentchild;

public class Lamborghini extends Car {

    private boolean IsFast;

    public Lamborghini(String model, boolean IsFast){
        super(model);
        this.IsFast = IsFast;
        this.isIndependent = false;
    }

    public void speak(){
        super.speak();
        System.out.println("I am fast " + this.IsFast);
    }
}