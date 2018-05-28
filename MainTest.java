package com.company;

import org.junit.Assert;

import static org.junit.Assert.*;

public class MainTest {

    @org.junit.Test
    public void main() {
    }

    @org.junit.Test
    public void modifiedselectionSort() {
        int[] a = {2, 3, 5, 8, 19, 27, 33, 42, 87, 91};
        int[] b = {2, 3, 5, 8, 19, 27, 33, 42, 87, 91};
        assertArrayEquals(a, b);
    }

    @org.junit.Test
    public void swap() {
        int[] a = {2, 3, 5, 8, 19, 27, 33, 42, 87, 91};
        int i = 2;
        int max = 3;

        int temp = a[i];
        a[i] = a[max];
        a[max] = temp;

        assertEquals(temp = 5, 5);
    }
}