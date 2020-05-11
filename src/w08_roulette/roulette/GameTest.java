package roulette;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class GameTest {

    /*
    assertEquals,
    assertTrue,
    assertFalse,
    assertNotEquals,
    assertNotNull,
    assertNull,
    assertArrayEquals,
    assertNotSame,
    assertSame,

    assertThat)
     */

    @Test
    public void WinTest(){

        int myBet = 5;
        Round r = new Round(10, 5);
        System.out.println(r.GetBalance());

        assertEquals(-myBet, r.GetBalance(),1.0);

        assertNotEquals(myBet,r.GetBalance(),1.0);

        assertNotNull(r);

        assertNull(null);

        assertArrayEquals(new int[]{1,2,3},new int[]{1,2,3});

        assertNotSame(myBet,-myBet);

        assertSame(myBet, myBet);

        assertThat(myBet,is(myBet));

        assertTrue(-myBet == r.GetBalance());

        assertFalse(myBet == r.GetBalance());

    }



    public static void main(String[] args) {

    }

}
