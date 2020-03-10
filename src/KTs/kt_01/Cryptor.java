package kt_01;

import java.io.*;

enum ACTIONTYPE {
    ENCRYPT,DECRYPT
}

public class Cryptor {

    private int rotation;

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

    public void setRotation(int rotation){
        this.rotation = rotation;
    }

    public void cryptFile(String fileName,ACTIONTYPE act){

        if (act == ACTIONTYPE.DECRYPT){
            fileName = fileName.replace(".","_encrypted.");
        }

        System.out.println(fileName);

        File file = new File(fileName);

        FileReader fr = null;
        try {
            fr = new FileReader(file);
        } catch (FileNotFoundException e) {
            System.out.println("Sellist faili pole");
            try {
                file.createNewFile();
                System.out.println("Tegin sellise faili");
            } catch (IOException ex) {
                e.printStackTrace();
            }
        }

        BufferedReader br = new BufferedReader(fr);
        String line = null;
        try {
            line = br.readLine();

            this.rotation = Integer.parseInt(line);
        } catch (IOException e) {
            e.printStackTrace();
        }


        FileWriter fw = null;
        try {
            if (act == ACTIONTYPE.DECRYPT){
                fileName = fileName.replace("_encrypted","");
            }else if (act == ACTIONTYPE.ENCRYPT){
                fileName = fileName.replace(".","_encrypted.");
            }

            fw = new FileWriter(fileName);
            fw.write(this.rotation+"\n");
        } catch (IOException e) {
            e.printStackTrace();
        }

        while(line != null){
            try {
            line = br.readLine();

            if (line != null){
                if (act == ACTIONTYPE.DECRYPT){

                    System.out.println(decrypt(line) + " = " + line);
                    fw.write(decrypt(line)+"\n");
                }else if (act == ACTIONTYPE.ENCRYPT){
                    System.out.println(line + " = " + encrypt(line));
                    fw.write(encrypt(line)+"\n");
                }

            }

            } catch (IOException e) {
                System.out.println("EX");
            }
        }
        try {
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

}
