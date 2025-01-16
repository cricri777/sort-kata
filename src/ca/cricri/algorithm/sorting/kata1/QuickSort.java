package ca.cricri.algorithm.sorting.kata1;

import ca.cricri.algorithm.sorting.RandomArray;

import java.util.Arrays;

public class QuickSort {
    public static void main(String[] args) {
        int[] toSort = RandomArray.gen(50, 100);

        System.out.println("before=" + Arrays.toString(toSort));
        QuickSort qs = new QuickSort();
        qs.sort(toSort, 0, toSort.length-1);
        System.out.println(" after=" + Arrays.toString(toSort));

    }

    /**
     * Algo:
     *      - calculate partition key
     *          - iterate over left array (before partition)
     *          - iterate over right array (after)
     */
    private void sort(int[] toSort, int lo, int hi) {
        if (hi <= lo) return;

        int partitionKey = partition(toSort, lo, hi);

        sort(toSort, lo, partitionKey - 1);
        sort(toSort, partitionKey + 1, hi);
    }

    /**
     * Algo:
     *      TODO
     */
    private int partition(int[] toSort, int lo, int hi) {
        int p = toSort[hi];
        int i = lo - 1;

        for (int j = lo; j < hi; j++) {
            if (toSort[j] <= p) {
                i++;

                //swap
                int tmp = toSort[j];
                toSort[j] = toSort[i];
                toSort[i] = tmp;
            }
        }
        //swap
        int tmp = toSort[i + 1];
        toSort[i + 1] = toSort[hi];
        toSort[hi] = tmp;

        return ++i;
    }
}
