package ca.cricri.algorithm.sorting;

import java.util.Random;

public class RandomArray {

    public static int[] gen(int size, int upperBound) {
        int[] array = new int[size];
        Random random = new Random();

        for (int i = 0; i < size; i++) {
            array[i] = random.nextInt(upperBound); // random number between 0 and upperBound - 1
        }

        return array;
    }
}
