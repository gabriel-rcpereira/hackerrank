package challenges.interviewtests;

/**
 * https://www.hackerrank.com/challenges/jumping-on-the-clouds/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class JumpingOnTheCloud {

    public static int jumpClouds(int[] c) {
        int numberOfJumps = 0;
        int index = 0;
        int length = c.length - 1;

        do {
            int nextCloud = Math.min(index + 2, length);
            if (c[nextCloud] == 0) {
                numberOfJumps ++;
                index += 2;
            } else {
                numberOfJumps ++;
                index ++;
            }

        } while (index < length);

        return numberOfJumps;
    }
}
