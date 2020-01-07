package challenges.interviewtests;

import challenges.interviewtests.RepeatedString;
import jdk.nashorn.internal.ir.annotations.Ignore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RepeatedStringTest {

    @Test
    @Ignore
    public void repeatStringWhenNumberSevenIsExpected(){
        final long expected = 7;
        final String stringToRepeat = "aba";
        final int numberToRepeat = 10;

        long repeated = RepeatedString.repeatString(stringToRepeat, numberToRepeat);

        Assertions.assertEquals(expected, repeated);
    }

    @Test
    public void repeatStringWhenNumberFourIsExpected(){
        final long expected = 4;
        final String stringToRepeat = "abcac";
        final int numberToRepeat = 10;

        long repeated = RepeatedString.repeatString(stringToRepeat, numberToRepeat);

        Assertions.assertEquals(expected, repeated);
    }
}
