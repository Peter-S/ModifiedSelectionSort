package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

//        sets up the Array List
        int[] elements = {42, 3, 19, 8, 5, 2, 27, 33, 91, 87};

//        prints list before sort and after sort
        System.out.println("Starting Numbers: " + Arrays.toString(elements));
        modifiedselectionSort(elements);
        System.out.println("Sorted List: " + Arrays.toString(elements));

    }

//      First method - iterates through list from end to beginning
//      looking for largest number / saves as max and after for loop is done
//      proceeds to swap method passing three parameters
    public static void  modifiedselectionSort(int[] a) {
        for (int i = a.length - 1; i >= 0; i--) {
            int max = i;
            for(int j = 0; j < i; j++) {
                if (a[j] > a[max]) {
                    max = j;
                }
            }
            swap(a, i, max);
//            prints out each time it makes a switch
            System.out.println(Arrays.toString(a));
        }

    }

//      second method / does the swap - placing  the new high value at the end of
//      array and placing the other value where the high value was
    public static void swap(int[] a, int i, int max) {
        int temp = a[i];
        a[i] = a[max];
        a[max] = temp;
    }
}
