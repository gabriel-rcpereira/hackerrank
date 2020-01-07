package challenges.interviewtests;

import challenges.interviewtests.CountingValley;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CountingValleyTest {

    @Test
    public void countingValleysWhenJustOneValleyIsExpected() {
        int numberOfValleysExpected = 1;
        final int numberOfSteps = 8;
        final String typeOfSteps = "UDDDUDUU";

        int numberOfValleys = CountingValley.countingValley(numberOfSteps, typeOfSteps);

        Assertions.assertEquals(numberOfValleysExpected, numberOfValleys);
    }

    @Test
    public void countingValleysWhenEightValleysAreExpected() {
        int numberOfValleysExpected = 2;
        final int numberOfSteps = 12;
        final String typeOfSteps = "DDUUDDUDUUUD";

        int numberOfValleys = CountingValley.countingValley(numberOfSteps, typeOfSteps);

        Assertions.assertEquals(numberOfValleysExpected, numberOfValleys);
    }
}
