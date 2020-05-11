package threading;

public class ThreadTest {
    /*
    Teha ka Threadi põhjal üks näide näiteks,
    kus samaaegselt käib 4 threadi,
    1 prindib numbreid 1st 10ni,
    teine thread 10st 1ni ja
    kolmas loeb tähti a-k (charcode 97 kuni 107) ja neljas k-a
     */

    public static void printNumbersAsc(){
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printNumbersDesc(){
        for (int i = 10; i > 0; i--) {
            System.out.println(i);
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printCharacters(){

        for (int i = 97; i <= 107; i++) {
            char c=(char)i;
            ;
            System.out.println(String.valueOf(c));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void printCharactersDesc(){

        for (int i = 107; i >= 97; i--) {
            char c=(char)i;
            ;
            System.out.println(String.valueOf(c));
            try {
                Thread.sleep(500);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void ex01(){

        for (int i = 0; i <5 ; i++) {
            new Thread(ThreadTest::printCharacters).start();
        }

        new Thread(ThreadTest::printCharacters).start();
        new Thread(ThreadTest::printCharactersDesc).start();
        new Thread(ThreadTest::printNumbersAsc).start();
        new Thread(ThreadTest::printNumbersDesc).start();
    }

    public static void main(String[] args) {
        ex01();
    }

}
