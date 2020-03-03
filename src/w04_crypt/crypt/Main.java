package crypt;

import com.sun.deploy.util.StringUtils;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void challenge(){

        /*
Given an array of integers, return a new array such that each element at index i of the new array is the product of all the numbers in the original array except the one at i.
For example, if our input was [1, 2, 3, 4, 5], the expected output would be [120, 60, 40, 30, 24]. If our input was [3, 2, 1], the expected output would be [2, 3, 6].
*/

        int[] numbers = new int[]{1,2,3,4,5};
        int[] numbers2 = new int[numbers.length];
        //[120, 60, 40, 30, 24]

        for (int i = 0; i <numbers.length ; i++) {

            int prod = 1;
            for (int j = 0; j <numbers.length; j++) {
                if (i != j){
                    prod *= numbers[j];
                }
            }
            numbers2[i] = prod;

            System.out.println(numbers2[i]);
        }



    }

    public static void countCharsString (String s, Boolean toLower){

        if (toLower){
            s = s.toLowerCase();
        }

        Map<Character, Integer> frequency = new HashMap<>();
        for (char c : s.toCharArray()) {
            frequency.merge(c,1, Integer::sum);
        }
        System.out.println("Characters:\n" + frequency);


    }

    public static void main(String[] args){

        challenge();

        /*

            Mingi stringi krüptimine tähtede nihutamise abil,
            Sul teada nihe nt et char 65 = A ehk A tähedete asemel oleks C ja
            arusaamatu tekst ja teine funktsioon, mis muudab selle ka tagasi normaalseks
         */
        /*
        String sentence = "See on mingi lause";
        Cryptor c = new Cryptor();

        String crypted = c.encrypt(sentence);
        System.out.println(crypted);
        String normal = c.decrypt(crypted);
        System.out.println(normal);

        File file = new File("test.txt");

        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Sellist faili pole");
            try {
                file.createNewFile();
                System.out.println("Tegin sellise faili");
            } catch (IOException ex) {

            }
        }

        BufferedReader br = new BufferedReader(fr);
        String line = null;
        try {
            line = br.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(line != null){
            System.out.println(line);
            try {
                line = br.readLine();
            } catch (IOException e) {
                System.out.println("EX");
            }
        }

        System.out.println(file.getName());

        //countChars(sentence,false);
        ///countChars(sentence,true);
*/
    }


}
