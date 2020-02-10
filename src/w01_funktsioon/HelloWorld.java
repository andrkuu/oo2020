package w01_funktsioon;

import java.util.Collections;

public class HelloWorld {

    static String wall = "|";
    static String floor = "─";
    static String roofLeft = "/";
    static String roofRight = "\\";
    static int rooms = 3;

    public static String genSpace(int length){
        return String.join("", Collections.nCopies(length, " "));
    }

    public static String genSymbol(int length, String s){
        return String.join("", Collections.nCopies(length, s));
    }

    public static String drawRoof(int width){


        String between = "";

        String roof = "";
        String line = "";
        String spaces = "";
        int c = 0;

        int kimney = 5;

        for (int a = width; a > 0; a--) {
            if (a == kimney){
                line += genSpace(a) + roofLeft + genSpace(c) + roofRight;
            }
            else if(a == kimney+1){
                line += genSpace(a) + roofLeft + genSpace(c) + roofRight;
            }
            else{
                line += genSpace(a) + roofLeft + genSpace(c) + roofRight;
            }

            roof = roof + line + "\n";

            line = "";
            c+=2;
        }
        System.out.print(roof);
        System.out.println(" " + genSymbol(width*2,"─"));

        return between + roofRight;
    }

    public static String drawWall(int length, int width){

        System.out.print(wall);
        for (int i = 0; i <width; i++) {
            System.out.print(floor);
        }
        System.out.print(wall);
        System.out.println();
        String space = "";



        for (int i = 0; i <length; i++) {

            for (int j = 0; j <=5; j++) {
               space = genSpace(width/rooms);
               space += wall;
               space += genSpace(width/rooms);
               space += wall;
               space += genSpace(width/rooms);
               space += wall;
            }
            System.out.println(wall + space);
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

    public static void drawCube(int x, int y)
    {


        String line = "";
        int c = 0;
        String floor = "─";
        String wall = "│";
        //System.out.println((x+2/10)*2);
        String shift = genSpace(((x+2)/10)*2);
        /*
        for (int a = x-5; a > 0; a--) {

            line += genSpace(a) + roofLeft + genSpace(x*2) + roofLeft +"\n";;

            //line = "";
            c+=2;
        }
        System.out.print(line);
        */
        System.out.println();
        System.out.print(shift);
        for (int j = 0; j <y; j++) {
            System.out.print("┎");
            for (int i = 0; i <x/2; i++) {
                System.out.print(floor);
            }
            System.out.print("┒");
        }


        System.out.print(shift);
        for (int j = 0; j <x-6; j++) {
            System.out.println("");
            System.out.print(shift);
            for (int i = 0; i <y; i++) {
                System.out.print(wall + genSpace(x/2) + wall);
            }
        }

        System.out.println();
        System.out.print(shift);
        for (int j = 0; j <y; j++) {
            System.out.print("┖");
            for (int i = 0; i < x/2; i++) {
                System.out.print(floor);
            }
            System.out.print("┚");
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");

        String space = " ";

        rooms = 3;
        int width = 20;
        int height = 3;
        int floors = 3;
        drawRoof(width);

        //drawWalls(height,width,floors);

        //drawCube(50,6);
        drawCube(width-2,3);

        /*
        for (int i = 7; i <20; i++) {
            drawRoof(i);
            drawCube(i-2,3);
            System.out.println();
        }*/



        //drawCube(width/2,4);
        //drawCube(4,6);
        //drawCube(8);
        //10-2
        //20-4
        //30-6
    }
}
