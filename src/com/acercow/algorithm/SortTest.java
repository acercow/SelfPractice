package com.acercow.algorithm;

import java.util.Arrays;

public class SortTest {

    public static void selectionSort(Comparable[] a) {
        int length = a.length;
        for (int i = 0; i < length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < length; j++) {
                if (a[min].compareTo(a[j]) > 0) {
                    min = j;
                }
            }
            exch(a, i, min);
        }
    }

    public static void insertSort(Comparable[] a) {
        int length = a.length;
        for (int i = 1; i < length; i++) {
            for (int j = i; j > 0; j--) {
                if (a[j].compareTo(a[j - 1]) < 0) {
                    exch(a, j, j - 1);
                }
            }
        }
    }

    public static int rank(int k, int[] a) {
        int low = 0;
        int high = a.length - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (k < mid) {
                high = mid - 1;
            } else if (k > mid) {
                low = mid + 1;
            } else {
                return mid;
            }
        }
        return -1;
    }

    public static int partition(Comparable[] a, int lo, int hi) {
        Comparable pivot = a[lo];
        while (lo < hi) {
            while (lo < hi && less(pivot, a[hi]))
                hi--;
            a[lo] = a[hi];
            while (lo < hi && less(a[lo], pivot))
                lo++;
            a[hi] = a[lo];
        }
        a[lo] = pivot;
        return lo;
    }

    public static void QuickSort(Comparable[] a) {
        QuickSort(a, 0, a.length - 1);

    }

    public static void QuickSort(Comparable[] a, int lo, int hi) {
        if (lo >= hi) return;
        int pivot = partition(a, lo, hi);
        QuickSort(a, lo, pivot - 1);
        QuickSort(a, pivot + 1, hi);
    }


    public static void main(String[] args) {
        Integer[] b = {93, 6, 3, 2, 4, 5, 2, 62, 4};
        int[] a = {1, 2, 3, 4, 5, 6, 7, 8};
        String[] s = {"string", "sf", "aa", "z", "fwe"};
        QuickSort(b);
        System.out.println(Arrays.toString(b));

    }

    public static boolean less(Comparable a, Comparable b) {
        return a.compareTo(b) <= 0;
    }


    public static void exch(Comparable[] a, int i, int j) {
        Comparable tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}
