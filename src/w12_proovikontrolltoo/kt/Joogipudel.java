package kt;

public class Joogipudel {



    private double volume;



    private double quantity;
    private Bottle_Type bottle_type;
    private double weight;
    private double price;
    private Drink_Type drink_type;

    public Joogipudel(Drink_Type drink_type, Bottle_Type bottle_type, double volume, double weight) {
        this.volume = volume;
        this.bottle_type = bottle_type;
        this.weight = weight;
        this.drink_type = drink_type;
    }

    public Bottle_Type GetBottleType(){
        return this.bottle_type;
    }

    public Drink_Type GetDrinkType(){
        return this.drink_type;
    }

    public void CalculatePrice(){
        this.price = this.weight * this.quantity;
    }

    public double GetVolume() {
        return volume;
    }

    public void SetQuantity(double quantity) {
        this.quantity = quantity;
        CalculatePrice();
    }

    public double GetPrice(){
        return this.price;
    }

    public double GetWeight() {
        return weight;
    }

    public void PrintPrice(){
        System.out.println("Ma maksan: " + this.price);
    }

    public void GetContent(){
        System.out.println("Ma olen " + this.drink_type.name() + " ja kaalun " + this.weight + "g");
    }
}
