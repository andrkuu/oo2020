package world;

import items.Item;

import java.util.HashMap;
import java.util.Map;


public class Inventory {


    private Map<Item, Integer> items;
    private int size;

    Inventory(int size){
        items = new HashMap<>();
        this.size = size;
    }


    public void addItems(Item[] items){
        if (items.length > this.size){
            for(Item item : items){
                if(this.items.containsKey(item)){
                    this.items.put(item, this.items.get(item) + 1);
                }
                else{
                    this.items.put(item, 1);
                }
            }
        }
        else{
            System.out.println("You tried to add to many items");
        }

    }

    public void addItem(Item item, int quantity){
        if (items.size() + quantity <= this.size){
            if(items.containsKey(item)){
                items.put(item, items.get(item) + quantity);
            }
            else{
                items.put(item, quantity);
            }
        }
        else{
            System.out.println("You tried to add to many items");
        }

    }

    public void removeItem(Item item, int quantity){
        System.out.println();
        if(items.containsKey(item)){
            if (items.get(item) >= 1){
                if(items.get(item) > quantity)
                {
                    items.put(item, items.get(item) - quantity);
                }
                else if(items.get(item) == quantity)
                {
                    items.remove(item);
                }
                else{
                    System.out.println("You only have "+ items.get(item) +" "+ item.toString() + " but you tried to remove " + quantity);
                }

            }

        }
        else{
            System.out.println("Inventory dosnt contain this item");
        }

    }

    @Override
    public String toString() {

        String ret = "";

        for (Item i : items.keySet()) {

            ret += i.toString() + " - " + items.get(i) +"\n";
        }

        return ret;
    }
}
