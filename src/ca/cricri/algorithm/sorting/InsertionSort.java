package ca.cricri.algorithm.sorting;

import java.util.Arrays;

public class InsertionSort {

    public static void main(String[] args) {
        int[] arrayToSort = {5, 12, 23, 51, 1, 23, 1, 4, 6, 156, 6, 3};

        InsertionSort is = new InsertionSort();
        System.out.println("sorted   array=" + Arrays.toString(is.sort(arrayToSort)));
        System.out.println("validate sorted array=" +
                Arrays.toString(Arrays.stream(arrayToSort).sorted().toArray()));
    }

    private int[] sort(int[] arrayToSort) {
        int arrayLength = arrayToSort.length;
        for (int i=1; i<arrayLength; i++) {
           for (int j=i; j>0 && arrayToSort[j] < arrayToSort[j-1]; j--) {
               // swap
               int k = arrayToSort[j];
               arrayToSort[j] = arrayToSort[j - 1];
               arrayToSort[j - 1] = k;
           }
        }
        return arrayToSort;
    }
}
