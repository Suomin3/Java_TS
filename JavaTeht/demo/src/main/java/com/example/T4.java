package main.java.com.example;

public class T4
{
    public void Teht4() {
        int[][] matrix = {
            {1, 5, 7},
            {9, 3, 1},
            {0, 1, 1}
        };
        int[] maxIndex = findMaxIndex(matrix);

        System.out.println("Vastaus: [" + maxIndex[0] + ", " + maxIndex[1] + "]");
    }
    public static int[] findMaxIndex(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        int[] maxIndex = new int[2];
        
        for (int i = 0; i < matrix.length; i++)
        {
            for (int j = 0; j < matrix[i].length; j++)
            {
                if (matrix[i][j] > max)
                {
                    max = matrix[i][j];
                    maxIndex[0] = i;
                    maxIndex[1] = j;
                }
            }
        }
        return maxIndex;
    }
}