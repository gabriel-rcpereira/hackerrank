package challenges.interviewtests;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MagicSquareTest {

    @Test
    public void shouldCalculateFirstLineWhenTheTotalOfSumIsLessThanMagicNumber(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 1;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 3);
        insertMatrixLine(matrix[1], 1, 5, 9);
        insertMatrixLine(matrix[2], 6, 7, 2);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateFirstLineWhenTheTotalOfSumIsMoreThanMagicNumber(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 1;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 5);
        insertMatrixLine(matrix[1], 1, 5, 9);
        insertMatrixLine(matrix[2], 6, 7, 2);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateFirstAndSecondLineWhenSecondLineHasTotalOfSumLessThanMagicNumber(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 1;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 4);
        insertMatrixLine(matrix[1], 1, 5, 8);
        insertMatrixLine(matrix[2], 6, 7, 2);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateFirstAndSecondLineWhenSecondLineHasTotalOfSumMoreThanMagicNumber(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 1;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 4);
        insertMatrixLine(matrix[1], 1, 6, 9);
        insertMatrixLine(matrix[2], 6, 7, 2);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateFirstSecondAndThirdLineWhenThirdLineHasTotalSumLessThanMagicNumber(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 1;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 4);
        insertMatrixLine(matrix[1], 1, 5, 9);
        insertMatrixLine(matrix[2], 6, 7, 1);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateFirstSecondAndThirdLineWhenTotalHasNoCost(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 0;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 8, 3, 4);
        insertMatrixLine(matrix[1], 1, 5, 9);
        insertMatrixLine(matrix[2], 6, 7, 2);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    @Test
    public void shouldCalculateUsingHackerHankData(){
        // when
        MagicSquare magicSquare = new MagicSquare();
        final int magicNumberExpected = 20;
        int[][] matrix = new int[3][3];
        insertMatrixLine(matrix[0], 4, 4, 7);
        insertMatrixLine(matrix[1], 3, 1, 5);
        insertMatrixLine(matrix[2], 1, 7, 9);

        // then
        int magicNumberCalculated = magicSquare.calculate(matrix);

        // assert
        Assertions.assertEquals(magicNumberExpected, magicNumberCalculated);
    }

    private void insertMatrixLine(int[] matrix, int c1, int c2, int c3) {
        matrix[0] = c1;
        matrix[1] = c2;
        matrix[2] = c3;
    }
}
