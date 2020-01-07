package challenges.array;

public class SimpleArraySummarize {

    static int simpleArraySum(int[] ar) {
        int arrSummarized = 0;

        for (int element : ar) {
            arrSummarized += element;
        }

        return arrSummarized;
    }
}
