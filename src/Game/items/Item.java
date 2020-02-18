package items;
public class Item {
    private String name;
    private ItemType type;
    private ItemMaterial material;

    public Item(String name, ItemType type, ItemMaterial material){
        this.name = name;
        this.type = type;
        this.material = material;
    }

    @Override
    public String toString() {
        return material.name() + " " + type.name();
    }

}
