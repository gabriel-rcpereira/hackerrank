package challenges.interviewtests;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static challenges.interviewtests.JumpingOnTheCloud.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class JumpingOnTheCloudTest {

    @Test
    @DisplayName("Jump Clouds Test when three jumps are expected")
    public void jumpCloudsTestWhenThreeJumpsAreExpected(){
        int numberOfJumpsExpected = 3;
        int[] clouds = createCloudsToJumpThreeTimes();

        int numberOfJumps = jumpClouds(clouds);

        assertEquals(numberOfJumpsExpected, numberOfJumps);
    }

    private int[] createCloudsToJumpThreeTimes() {
        int[] clouds = new int[6];
        clouds[0] = 0;
        clouds[1] = 0;
        clouds[2] = 0;
        clouds[3] = 0;
        clouds[4] = 1;
        clouds[5] = 0;
        return clouds;
    }
}
