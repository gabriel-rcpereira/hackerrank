package challenges.string;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WeightedStringTest {

    @Test
    public void test01() {
        String[] expected = { "Yes" };
        int[] queries = { 1 };

        String[] actual = WeightedString.weightedUniformStrings("a", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test02() {
        String[] expected = { "Yes", "Yes" };
        int[] queries = { 1, 4 };

        String[] actual = WeightedString.weightedUniformStrings("ad", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test03() {
        String[] expected = { "Yes", "No", "Yes" };
        int[] queries = { 1, 3, 4 };

        String[] actual = WeightedString.weightedUniformStrings("abd", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test04() {
        String[] expected = { "Yes", "Yes", "Yes" };
        int[] queries = { 1, 3, 6 };

        String[] actual = WeightedString.weightedUniformStrings("abcc", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test05() {
        String[] expected = { "Yes", "No", "Yes", "Yes", "No" };
        int[] queries = { 9, 7, 8, 12, 5 };

        String[] actual = WeightedString.weightedUniformStrings("aaabbbbcccddd", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test06() {
        String[] expected = { "Yes", "Yes", "Yes", "Yes", "No", "No" };
        int[] queries = { 1, 3, 12, 5, 9, 10 };

        String[] actual = WeightedString.weightedUniformStrings("abccddde", queries);

        Assertions.assertArrayEquals(expected, actual);
    }

    @Test
    public void test07() {
        String[] expected = { "Yes", "No", "Yes", "Yes", "No" };
        int[] queries = { 9, 7, 8, 12, 5 };

        String[] actual = WeightedString.weightedUniformStrings("aaabbbbcccddd", queries);

        Assertions.assertArrayEquals(expected, actual);
    }
}
