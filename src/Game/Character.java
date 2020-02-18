
public class Character {

    private String name;
    private CharacterType characterType;
    public Direction direction;
    public Inventory inventory;
    public Position position;

    public String slogan = "";

    public Character(String name, CharacterType characterType, Position position){
        this.characterType = characterType;
        this.name = name;
        this.direction = Direction.UP;
        this.position = position;

        inventory = new Inventory();
    }

    public Direction getDirection(){
        return direction;
    }



    void move(Direction direction){

        this.direction = direction;

        switch (direction){

            case UP:
                this.position.y++;
                break;
            case DOWN:
                this.position.y--;
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
