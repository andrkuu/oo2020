package Renderer;

public class ConsoleShapes {

    String ulCorner = "╔";
    String llCorner = "╚";
    String urCorner = "╗";
    String lrCorner = "╝";
    String vertical = "║";
    String horizontal = "═";

    public String square(){

        String r = "╔══════╗\n║      ║\n║      ║\n╚══════╝";
        return r;
    }

    public String ground(){

        String r = "███████\n███████\n███:███\n███████\n███████";
        return r;
    }

}
