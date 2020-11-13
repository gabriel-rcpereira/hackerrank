package challenges.warmup;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

public class BirthdayCakeCandles {

    public static int birthdayCakeCandles(List<Integer> candles) {
        AtomicInteger tallestCandle = new AtomicInteger();

        for (Integer candle : candles) {
            if (candle.compareTo(tallestCandle.get()) > 0) {
                tallestCandle.set(candle.intValue());
            }
        }

        Long longCount = candles.stream()
                .filter(candle -> candle.intValue() == tallestCandle.get())
                .count();

        return longCount.intValue();
    }
}
