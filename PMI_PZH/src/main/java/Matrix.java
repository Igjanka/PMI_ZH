import java.util.ArrayList;

public class Matrix {
    public static ArrayList<Integer> numbersDivisibleByThree(int[][] matrix)
    {
        ArrayList<Integer> result = new ArrayList<Integer>();
        for (int i = 0; i < matrix.length; i++)
        {
            for (int number:matrix[i])
            {
                if (number % 3 == 0)
                {

                }
            }
        }
        return result;
    }

    public static int minimum (int[][] matrix)
    {
        int min = 1000;
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++)
            {
                if(matrix[i][j] <= min)
                {
                    matrix[i][j] = min;
                }
            }
        }
        return min;
    }

}
