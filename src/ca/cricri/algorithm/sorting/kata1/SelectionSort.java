package ca.cricri.algorithm.sorting.kata1;

import java.util.Arrays;

public class SelectionSort {


    public static void main(String[] args) {
        int[] arrayToSort = {5, 12, 23, 51, 1, 23, 1, 4, 6, 156, 6, 3};

        SelectionSort ss = new SelectionSort();
        System.out.println("sorted   array=" + Arrays.toString(ss.sort(arrayToSort)));
        System.out.println("validate sorted array=" +
        Arrays.toString(Arrays.stream(arrayToSort).sorted().toArray()));
    }

    int[] sort(int[] arrayToSort) {
        for (int i = 0; i<arrayToSort.length; i++) {
            int min = Integer.MAX_VALUE;
            int minPosition = -1;
            for (int j = i; j<arrayToSort.length; j++) {
                if (arrayToSort[j] < min) {
                    min = arrayToSort[j];
                    minPosition = j;
                }
            }
            // swap
            int tmp = arrayToSort[i];
            arrayToSort[i] = arrayToSort[minPosition];
            arrayToSort[minPosition] = tmp;
        }
        return arrayToSort;
    }
}


