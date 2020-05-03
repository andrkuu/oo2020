package kt;

import java.util.ArrayList;

public class JoogiKast {

    private ArrayList<Joogipudel> joogid = new ArrayList<>();
    private double weight = 0;
    private double price = 0;
    private Bottle_Type bottle_type;
    private Drink_Type drink_type;

    public void AddBottle(Joogipudel pudel){
        if(this.joogid.isEmpty()){
            this.bottle_type = pudel.GetBottleType();
            this.drink_type = pudel.GetDrinkType();
            joogid.add(pudel);
            this.weight += pudel.GetWeight();
            this.price += pudel.GetPrice();
        }else{
            if(this.bottle_type == pudel.GetBottleType() && this.drink_type == pudel.GetDrinkType()){
                joogid.add(pudel);
                this.weight += pudel.GetWeight();
                this.price += pudel.GetPrice();
            }
            else if(this.bottle_type != pudel.GetBottleType()){
                System.out.println(pudel.GetBottleType().name() +" ei saa panna " + this.bottle_type.name() +" kasti");
            }
            else if(this.drink_type != pudel.GetDrinkType()){
                System.out.println(pudel.GetDrinkType().name() +" ei saa panna " + this.drink_type.name() +" kasti");
            }
        }


    }

    public double getPrice() {
        return price;
    }

    public double getWeight() {
        return weight;
    }

    public void PrintInfo(){
        System.out.println("");
        System.out.println("Kasti kaal: " + this.weight);
        System.out.println("Kasti hind: " + this.price);
    }




}
