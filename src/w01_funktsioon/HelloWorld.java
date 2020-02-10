package w01_funktsioon;

import java.util.Collections;

public class HelloWorld {

    static String wall = "|";
    static String floor = "-";
    static String roofLeft = "/";
    static String roofRight = "\\";

    public static String genSpace(int length){
        return String.join("", Collections.nCopies(length, " "));
    }

    public static String drawRoof(int width){


        String between = "";

        String roof = "";
        String line = "";
        String spaces = "";
        int c = 0;

        for (int a = width; a > 0; a--) {
            line += genSpace(a) + roofLeft + genSpace(c) + roofRight;

            //roof += roofRight;
            roof = roof + line + "\n";
            line = "";
            c+=2;
        }
        System.out.print(roof);


        return between + roofRight;
    }

    public static String drawWall(int length, int width){

        System.out.print(wall);
        for (int i = 0; i <width; i++) {
            System.out.print(floor);
        }
        System.out.print(wall);
        System.out.println();
        for (int i = 0; i <length; i++) {
            System.out.println(wall + genSpace(width) + wall);
        }

        return "";
    }

    public static void drawWalls(int height, int width, int floors)
    {
        for (int i = 0; i <floors; i++) {
            drawWall(height,width*2);
        }
        System.out.print(" ");
        for (int i = 0; i <width*2; i++) {
            System.out.print(floor);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String space = " ";

        int width = 20;
        int height = 7;
        int floors = 3;
        drawRoof(width);

        drawWalls(height,width,floors);

    }
}
