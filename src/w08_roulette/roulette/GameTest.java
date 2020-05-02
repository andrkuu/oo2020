package roulette;

import org.junit.Test;
import static org.junit.Assert.*;

public class GameTest {


    @Test
    public void WinTest(){
        int myBet = 5;
        Round r = new Round(10, 5);
        System.out.println(r.GetBalance());

        assertEquals(-myBet, r.GetBalance(),1.0);

        assertNull(null);

        assertTrue(-myBet == r.GetBalance());

        assertFalse(myBet == r.GetBalance());

    }



    public static void main(String[] args) {

    }

}
