package kt;


public class Main {
    public static void main(String[] args) {



        JoogiVaat vaat1 = new JoogiVaat(300,60);
        System.out.println(vaat1);
        vaat1.Fill(90);
        System.out.println(vaat1);

        Joogipudel jook1 = new Joogipudel(Drink_Type.KALI,Bottle_Type.KLAAS,29,300);
        //vaat1.FillBottle(jook1);

        Joogipudel jook2 = new Joogipudel(Drink_Type.LIMONAAD,Bottle_Type.KLAAS,29,300);
        //vaat1.FillBottle(jook2);

        Joogipudel jook3 = new Joogipudel(Drink_Type.KALI,Bottle_Type.PLASTIK,29,300);
        //vaat1.FillBottle(jook3);

        vaat1.FillBottles(jook1,jook2,jook3);

        JoogiKast kast1 = new JoogiKast();
        kast1.AddBottle(jook1);
        kast1.PrintInfo();
        kast1.AddBottle(jook2);
        kast1.PrintInfo();
        kast1.AddBottle(jook3);
        kast1.PrintInfo();


    }
}
