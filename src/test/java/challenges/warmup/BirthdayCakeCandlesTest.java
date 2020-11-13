package challenges.warmup;

import com.sun.tools.javac.util.List;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class BirthdayCakeCandlesTest {

    @Test
    public void shouldReturnTwoTallestCandles() {
        int amountOfTallestCandle = BirthdayCakeCandles.birthdayCakeCandles(List.of(3, 2, 1, 3));
        Assertions.assertEquals(2, amountOfTallestCandle);
    }

    @Test
    public void shouldReturnFiveTallestCandles() {
        int amountOfTallestCandle = BirthdayCakeCandles.birthdayCakeCandles(List.of(3,
                1000,
                1000,
                1000,
                1000,
                1000,
                5000,
                5000,
                5000,
                5000,
                5000,
                9000,
                9000,
                9000,
                9000,
                9000,
                2,
                1,
                3));

        Assertions.assertEquals(5, amountOfTallestCandle);
    }
}
