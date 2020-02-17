package w02_klass.Game;

import w02_klass.Game.items.Item;
import w02_klass.Game.items.ItemMaterial;
import w02_klass.Game.items.ItemType;

public class Main {
    public static void main(String[] args){

        Character me = new Character("Andreas",CharacterType.WARRIOR);
        me.slogan = "A";

        Item goldHelmet = new Item("Gold Helmet", ItemType.HELMET, ItemMaterial.GOLD);
        Item bronzeshield = new Item("Bronze Shield", ItemType.SHIELD, ItemMaterial.BRONZE);

        me.inventory.addItem(goldHelmet,2);
        me.inventory.addItem(bronzeshield,2);


        me.inventory.removeItem(goldHelmet,3);

        System.out.println(me.inventory);
    }
}
