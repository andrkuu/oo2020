package kt;

import org.junit.Test;
import roulette.Round;

import static org.junit.Assert.*;

public class MainTest {


    @Test
    public void BottleTest(){
        float vaatQuantity = 30;
        JoogiVaat vaat1 = new JoogiVaat(100,vaatQuantity);
        System.out.println(vaat1);
        vaat1.Fill(90);
        System.out.println(vaat1);

        Joogipudel jook1 = new Joogipudel(Drink_Type.KALI,Bottle_Type.KLAAS,29,300);

        assertTrue(vaat1.FillBottle(jook1));
        assertTrue(vaatQuantity - jook1.GetVolume() == vaat1.getQuantity() );

        JoogiKast kast1 = new JoogiKast();

        int jookCount = 10;

        for (int i = 0; i <jookCount ; i++) {
            kast1.AddBottle(jook1);
        }

        assertTrue( kast1.getWeight() == jook1.GetWeight()*jookCount );
    }



    public static void main(String[] args) {

    }

}

