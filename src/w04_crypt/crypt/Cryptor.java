package crypt;

public class Cryptor {

    int rotation = 1;

    public String encrypt(String s){
        String newString = "";
        for (int i = 0; i <s.length(); i++) {
            int val = s.charAt(i);
            val += this.rotation;
            newString += (char)val;

        }
        return newString;

    }

    public String decrypt(String s){
        String newString = "";
        for (int i = 0; i <s.length(); i++) {
            int val = s.charAt(i);
            val -= this.rotation;
            newString += (char)val;

        }
        return newString;
    }

}
