package main.java.com.example;

import java.util.Arrays;

public class T5
{
    public void Teht5() {
        int[] firstArray = {8, 3, 2, 7};
        int[] sortedArray = sortArray(firstArray);

        System.out.println("Annettu array: " + Arrays.toString(firstArray));
        System.out.println("Järjestetty array: " + Arrays.toString(sortedArray));
    }

    public int[] sortArray(int[] array) {

        int[] sortedArray = Arrays.copyOf(array, array.length);

        Arrays.sort(sortedArray);

        return sortedArray;
    }
}