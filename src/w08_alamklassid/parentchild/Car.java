package parentchild;

public class Car {

    public String model;

    public boolean isIndependent;

    public Car(String model){
        this.model = model;
        this.isIndependent = true;
    }

    public void speak(){
        System.out.println("I am "+this.toString() + " "+this.model);
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName();
    }
}