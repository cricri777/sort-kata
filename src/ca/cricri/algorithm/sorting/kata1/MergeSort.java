package ca.cricri.algorithm.sorting.kata1;

import java.util.Arrays;

public class MergeSort {
    private final int [] tmp;

    public MergeSort(int len) {
        this.tmp = new int[len];
    }

    public static void main(String[] args) {
        int[] toSort = {5, 12, 23, 51, 1, 23, 1, 4, 6, 156, 6, 3};
        MergeSort ms = new MergeSort(toSort.length);

        System.out.println(Arrays.toString(toSort));
        ms.sort(toSort, 0, toSort.length - 1);
        System.out.println(Arrays.toString(toSort));
    }

    private void sort(int[] a, int lo, int hi) {
        if (hi <= lo) return;

        int mid = lo + (hi - lo) / 2;
        sort(a, lo, mid);
        sort(a, mid + 1, hi);

        mergeArray(a, lo, mid, hi);
    }

    private void mergeArray(int[] a, int lo, int mid, int hi) {
        int i = lo, j = mid + 1;

        for (int k = lo; k <= hi; k++)
            tmp[k] = a[k];

        for (int k = lo; k <= hi; k++)
            if (i > mid) a[k] = tmp[j++];
            else if (j > hi) a[k] = tmp[i++];
            else if (tmp[j] < tmp[i]) a[k] = tmp[j++];
            else a[k] = tmp[i++];
        }
    }
