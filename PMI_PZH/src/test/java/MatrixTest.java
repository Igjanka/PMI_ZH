import java.util.ArrayList;
import java.util.Random;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class MatrixTest {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MATRIX_LENGTH = 5;

    // TODO: Uncomment testcase to test minimum method.

    @Test
    public void testMinimum() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        assertEquals(-97, Matrix.minimum(matrix));
    }


    // TODO: Uncomment testcase to test numbersDivisibleByThree method.

    @Test
    public void testNumbersDivisibleByThree() {
        int[][] matrix = {
                { 84,  67,  22, -72,  95},
                { 72, -70,   2, -88,  30},
                { 95, -79, -87, -27, -97},
                {-52, -64, -13, -19, -27},
                { 79,  89,  95, -84, -53}
        };

        ArrayList<Integer> actual = Matrix.numbersDivisibleByThree(matrix);

        assertEquals(7, actual.size());
        assertTrue(actual.contains(84));
        assertTrue(actual.contains(-72));
        assertTrue(actual.contains(72));
        assertTrue(actual.contains(30));
        assertTrue(actual.contains(-87));
        assertTrue(actual.contains(-27));
        assertTrue(actual.contains(-84));
    }

}
