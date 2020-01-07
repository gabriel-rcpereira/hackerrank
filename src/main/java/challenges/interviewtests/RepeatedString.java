package challenges.interviewtests;

/**
 * https://www.hackerrank.com/challenges/repeated-string/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class RepeatedString {

    public static long repeatString(String s, long n) {
        long numberOfRepeat = getNumberOfRepeat(s, s.length());
        long numberOfRepeatModule =+ getNumberOfRepeat(s, (n % s.length()));

        return (numberOfRepeat * Math.floorDiv(n, Long.valueOf(s.length()))) + numberOfRepeatModule;
    }

    private static long getNumberOfRepeat(String s, long length) {
        long t = 0;
        for (int index = 0; index < length; index++) {
            if (s.substring(index).startsWith("a")){
                t ++;
            }
        }
        return t;
    }
}
