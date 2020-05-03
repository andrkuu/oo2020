package trycatch;

import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {

    public static void WriteErrorsToFile(ArrayList<String> errors){
        FileWriter errorWriter = null;
        try {
            errorWriter = new FileWriter("error-log.txt");

            for (String error:errors) {
                errorWriter.write(error+"\n");
            }

            errorWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static String GetCurrentDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        return dtf.format(now);

    }

    public static void ex01(){
        //Luua 2 olukorda koodis, mis viskaks exceptioni ning try-catch blokiga kinni püüda ja loggida tulemus faili
        ArrayList<String> errors = new ArrayList<>();

        int[] arr = new int[]{
                10, 2
        };
        int num1, num2;
        try {

            num1 = 0;
            num2 = 62 / num1;

            System.out.println(num2);

        }
        catch (ArithmeticException e) {
            errors.add(GetCurrentDate() +" - Nulliga jagamise exception");
            System.out.println("Nulliga jagamise exception");
        }

        try{
            System.out.println(arr[3]);
        }
        catch (IndexOutOfBoundsException e) {
            errors.add(GetCurrentDate() +" - IndexOutOfBoundsException");
            System.out.println("IndexOutOfBoundsException ");
        }


        WriteErrorsToFile(errors);
    }

    public static int randomInt(){
        Random r = new Random();
        int a = r.nextInt((90 - 65) + 1) + 65;
        return a;
    }

    public static String randomChar(){
         Random r = new Random();
         int a = r.nextInt((90 - 65) + 1) + 65;
         char c=(char)a;
         return String.valueOf(c);
    }

    public static void ex02(){
        //Luua 3 List tüüpi muutujat, milles ühe sees on stringid, teise sees integer arvud ja forEachiga välja printida

        List<String> stringList = new ArrayList<String>();
        stringList.add(randomChar());
        stringList.add(randomChar());
        stringList.add(randomChar());
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(randomInt());
        intList.add(randomInt());
        intList.add(randomInt());

        for (String s: stringList) {
            System.out.println(s);
        }

        for (int i: intList) {
            System.out.println(i);
        }


    }

    public static String removeWord(String sentence, String word){
        List<String> lines = Arrays.asList(sentence.split(" "));
        List<String> result = lines.stream()
                .filter(line -> !word.equals(line))
                .collect(Collectors.toList());
        return result.toString();
    }

    public static void ex03(){
        //Kasutada filter/map/skip/min/max/count/collect funktsioone ja näidata midagi huvitavat nende andmetega

        List<String> lines = Arrays.asList("Eesti", "Läti", "Leedu");
        List<String> result = lines.stream()
                .filter(line -> !"Eesti".equals(line))
                .collect(Collectors.toList());

        result.forEach(System.out::println);

        String sentence = "Java on programmeerimiskeel. Java -ga tegeledes saad teha palju asju. Mulle meeldib Java";
        System.out.println(removeWord(sentence,"Java"));



    }

    public static void ex04(){
        //IntStream.of ja IntStream.range -iga näidata toimivust mingisugusest kogumikust
        // välja filtreerida paaris ja paaritud arvud ning kasutada allMatch/anyMatch funktsioone ka, et leida esinevus

        IntStream.of(2,4,6,8,10);
        Stream<Integer> numbers = IntStream.rangeClosed(1,10).boxed();

        if(numbers.anyMatch(integer -> integer % 2 == 0)){
            System.out.println("Esineb paaris arve");
        }
        numbers = IntStream.rangeClosed(1,10).boxed();

        numbers.filter(integer -> integer % 2 == 0).forEach(integer -> System.out.println(integer));
        // paaris numbrid



        numbers = IntStream.rangeClosed(1,10).boxed();
        numbers.filter(integer -> integer % 2 != 0).forEach(integer -> System.out.println(integer));

        numbers = IntStream.rangeClosed(1,10).boxed();
        if(numbers.anyMatch(integer -> integer % 2 != 0)){
            System.out.println("Esineb paarituid arve");
        }

        // paaritud numbrid


    }


    public static void main(String[] args) {

        //ex01();
        //ex02();
        //ex03();
        //ex04();
    }


}
