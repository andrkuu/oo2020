package kt_01;

public class Main {



    public static void main(String[] args){

        Cryptor c = new Cryptor();

        c.cryptFile("Text.txt",ACTIONTYPE.ENCRYPT);
        //c.cryptFile("Text.txt",ACTIONTYPE.DECRYPT);

    }
}
