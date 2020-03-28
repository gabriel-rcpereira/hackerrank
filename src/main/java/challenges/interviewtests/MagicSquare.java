package challenges.interviewtests;

public class MagicSquare {

    int[][][] possiblePermutations = {
            {{8, 1, 6}, {3, 5, 7}, {4, 9, 2}},// 1

            {{6, 1, 8}, {7, 5, 3}, {2, 9, 4}},// 2

            {{4, 9, 2}, {3, 5, 7}, {8, 1, 6}},// 3

            {{2, 9, 4}, {7, 5, 3}, {6, 1, 8}},// 4

            {{8, 3, 4}, {1, 5, 9}, {6, 7, 2}},// 5

            {{4, 3, 8}, {9, 5, 1}, {2, 7, 6}},// 6

            {{6, 7, 2}, {1, 5, 9}, {8, 3, 4}},// 7

            {{2, 7, 6}, {9, 5, 1}, {4, 3, 8}},// 8
    };

    public int calculate(int[][] s) {
        int minCost = Integer.MAX_VALUE;
        for (int permutation = 0; permutation < 8; permutation++) {
            int permutationCost = 0;
            for (int row = 0; row < 3; row++) {
                for (int column = 0; column < 3; column++) {
                    permutationCost += Math.abs(s[row][column] - possiblePermutations[permutation][row][column]);
                }
            }
            minCost = Math.min(minCost, permutationCost);
        }
        return minCost;
    }
}
