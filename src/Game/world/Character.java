package world;

import world.Position;

import static world.Direction.*;

public class Character extends WorldObject {

    private String name;
    private CharacterType characterType;

    public Inventory inventory;


    public String slogan = "";

    public Character(String name, CharacterType characterType, Position position){
        this.characterType = characterType;
        this.name = name;
        this.direction = UP;
        this.position = position;

        inventory = new Inventory();
    }

    public Direction getDirection(){
        return direction;
    }

    public String getName(){
       return name;
    }

    public void move(Direction direction){

        this.direction = direction;

        switch (direction){

            case UP:
                this.position.y--;
                break;
            case DOWN:
                this.position.y++;
                break;
            case RIGHT:
                this.position.x++;
                break;
            case LEFT:
                this.position.x--;
                break;


        }

        System.out.println("I moved to " + this.position);
    }

    @Override
    public String toString() {
        return "My name is: "+name+" and i am at x: "+ this.position.x + " y: " + this.position.y;
    }
}
