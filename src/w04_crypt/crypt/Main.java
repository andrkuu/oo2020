package crypt;

import com.sun.deploy.util.StringUtils;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public static void countChars(String s, Boolean toLower){

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
        /*

            Mingi stringi krüptimine tähtede nihutamise abil,
            Sul teada nihe nt et char 65 = A ehk A tähedete asemel oleks C ja
            arusaamatu tekst ja teine funktsioon, mis muudab selle ka tagasi normaalseks
         */

        String sentence = "See on mingi lause";
        Cryptor c = new Cryptor();

        String crypted = c.encrypt(sentence);
        System.out.println(crypted);
        String normal = c.decrypt(crypted);
        System.out.println(normal);

        countChars(sentence,false);
        countChars(sentence,true);

    }


}
