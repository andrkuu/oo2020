package world;

import world.Position;

import static world.Direction.*;

/**
 * Character
 */
public class Character {

    public boolean isVisible = true;

    public String slogan = "";
    private String symbol = "?";

    private String name;
    private CharacterType characterType;
    public Direction direction;
    public Inventory inventory;
    public Position position;

    public Character( String name, CharacterType characterType, Position position, String symbol){
        this.name = name;
        this.characterType = characterType;
        this.direction = Direction.RIGHT;
        this.symbol = symbol;
        this.position = position;
        this.inventory = new Inventory(10);
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString(){
        return "My name is " + name + " and I am at x:" + position.x + " y:" + position.y + " and my slogan is: " + slogan;
    }

    public String getSymbol(){
        return this.symbol;
    }

    public void changeDirection(Direction direction){
        this.direction = direction;
        move();
    }

    public void move(){
        switch (this.direction) {
            case UP:
                this.position.y--;
                break;
            case RIGHT:
                this.position.x++;
                break;
            case DOWN:
                this.position.y++;
                break;
            case LEFT:
                this.position.x--;
                break;
            default:
                break;
        }

        System.out.println(this);
    }

}

