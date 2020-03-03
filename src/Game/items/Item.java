package items;
public class Item {
    private String name;
    private ItemType type;
    private ItemMaterial material;
    private int durability;
    private double weight;
    private int level;

    public Item(String name, ItemType type, ItemMaterial material, double weight){
        this.name = name;
        this.type = type;
        this.material = material;
        this.durability = 100;
        this.level = 0;
        this.weight = weight;
    }

    @Override
    public String toString() {
        return material.name() + " " + type.name();
    }

}
