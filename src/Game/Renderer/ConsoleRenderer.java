package Renderer;

public class ConsoleRenderer {


    private ConsoleShapes shapes;

    public ConsoleRenderer(){
        this.shapes = new ConsoleShapes();
    }

    public void clearScreen() {
        System.out.print("\033[H\033[2J");
        System.out.flush();
    }

    public void renderGame(){
        System.out.println(shapes.ground());
    }
}
