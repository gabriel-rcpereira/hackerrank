package challenges.interviewtests;

import org.junit.jupiter.api.Test;

import static challenges.interviewtests.SockMerchant.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SockMerchantTest {

    @Test
    public void sockMerchantWhenThereAreNineSocksAndThreePairsExpected(){
        int numbersOfPairExpected = 3;
        int[] socks = createNineSocksWithThreePairs();

        int pairs = sockMerchant(socks.length, socks);

        assertEquals(numbersOfPairExpected, pairs);
    }

    public int[] createNineSocksWithThreePairs(){
        int[] ar = new int[9];
        ar[0] = 10;
        ar[1] = 20;
        ar[2] = 20;
        ar[3] = 10;
        ar[4] = 10;
        ar[5] = 30;
        ar[6] = 50;
        ar[7] = 10;
        ar[8] = 20;
        return ar;
    }
}
