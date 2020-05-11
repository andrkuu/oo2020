package kt;

import org.junit.Test;
import roulette.Round;

import static org.junit.Assert.*;

public class MainTest {
    float vaatQuantity = 30;

    @Test
    public void BottleTest(){

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

    @Test
    public void VaatTest(){
        JoogiVaat vaat1 = new JoogiVaat(100,vaatQuantity);
        vaat1.Fill(90);

        Joogipudel jook1 = new Joogipudel(Drink_Type.KALI,Bottle_Type.KLAAS,120,300);
        Joogipudel jook2= new Joogipudel(Drink_Type.KALI,Bottle_Type.KLAAS,20,300);


        assertFalse(vaat1.FillBottle(jook1));
        assertTrue(vaat1.FillBottle(jook2));

        assertTrue(vaatQuantity -jook2.GetVolume() == vaat1.getQuantity());

    }

    /*
    assertEquals,
    assertArrayEquals,
    assertTrue,
    assertFalse,
    assertNotEquals,
    assertNotNull,
    assertNotSame,
    assertNull,
    assertSame,
    assertThat)
     */


    public static void main(String[] args) {

    }

}

