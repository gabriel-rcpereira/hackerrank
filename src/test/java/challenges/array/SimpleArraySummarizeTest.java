package challenges.array;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SimpleArraySummarizeTest {

    @Test
    public void simpleArraySum_expected() {
        // given
        int expected = 53;
        int[] ar = new int[]{1, 2, 3, 5, 8, 13, 21};

        // when
        int arraySummarized = SimpleArraySummarize.simpleArraySum(ar);

        // then
        Assertions.assertEquals(expected, arraySummarized);
    }
}
