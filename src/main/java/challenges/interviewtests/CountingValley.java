package challenges.interviewtests;

/**
 * https://www.hackerrank.com/challenges/counting-valleys?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
 */
public class CountingValley {
    public static int countingValley(final int numberOfSteps, final String typeOfSteps) {
        int numberOfValleys = 0;
        int levelFromSea = 0;
        for(int index = 0; index < numberOfSteps; index ++){
            String step = typeOfSteps.substring(index, index+1);
            if (step.startsWith("U")){
                levelFromSea ++;
            } else {
                if (levelFromSea == 0) {
                    numberOfValleys++;
                }

                levelFromSea --;
            }
        }

        return numberOfValleys;
    }
}
