package tiktok;

public class Main {

    public static void main(String[] args) {

        float length = 10f;
        Clock clock = new Clock(length * 10000);

        Gear g1 = new Gear(9,"A");
        Gear g2 = new Gear(6,"B");
        Gear g3 = new Gear(3,"C");

        // Hammasrattaid saab omavahel kokku ühendada ning hammaste arvu erinevust ülekandena kasutada.

        g1.JoinGear(g1);
        g1.JoinGear(g2);
        g2.JoinGear(g1);
        g2.JoinGear(g3);

        //Lisa üks ratas kella külge
        clock.JoinGear(g1);

        Hand secondHand = new SecondHand(1,"S");
        Hand minuteHand = new MinuteHand(1,"M");

        //Lisa ratta külge osuti
        g2.JoinHand(secondHand);


        for (Gear clockGear:clock.gearList) {
            Gear clockGear2 = clockGear.connectedGears.get(0);
            clockGear2.connectedGears.get(0);
        }


        //clock.AddHand(secondHand);
        //clock.AddHand(minuteHand);

        clock.Start();

    }

}
